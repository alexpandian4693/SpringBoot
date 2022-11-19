package com.java.service;

import com.java.commonfiles.APIResponse;
import com.java.commonfiles.BadRequestException;
import com.java.commonfiles.Error;
import com.java.data.BookData;
import com.java.dto.*;
import com.java.model.Author;
import com.java.model.Book;
import com.java.model.BookAuthor;
import com.java.model.BookEdition;
import com.java.repo.BookAuthorRepository;
import com.java.repo.BookEditionRepository;
import com.java.repo.BookRepository;
import com.java.validator.BookValidator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookAuthorRepository bookAuthorRepository;

    @Autowired
    private BookValidator bookValidator;
    @Autowired
    private BookEditionRepository bookEditionRepository;

    // Get
    public List<Book> getBooks(Set<Integer> yop, String bookType) {

        List<Book> bookList = new ArrayList<>();

        if (yop == null) {
            bookRepository.findAll()
                    .forEach(book -> bookList.add(book));
        } else {
            return bookRepository.findAllByYearOfPublicationInAndBookType(yop, bookType);
        }

        return bookList;
    }


    public Book createBook(BookRequestDTO bookDTO) {

      
        List<Error> errors = bookValidator.validateCreateBookRequest(bookDTO);

  
        if(errors.size() > 0){
            throw new BadRequestException("bad request", errors);
        }

        Book book = new Book();
        book.setName(bookDTO.getName());
        book.setBookType(bookDTO.getBookType());
        book.setDesc(bookDTO.getDesc());
        book.setYearOfPublication(bookDTO.getYearOfPublication());
        bookRepository.save(book);

        if(!Objects.isNull(bookDTO.getEditions())) {
            bookDTO.getEditions().forEach(bookEditionDTO -> {
                BookEdition bookEdition = new BookEdition();
                bookEdition.setBook(book);
                bookEdition.setIsbn(bookEditionDTO.getIsbn());
                bookEdition.setDescription(bookEditionDTO.getDesc());
                bookEdition.setPageSize(bookEditionDTO.getPageSize());
                bookEdition.setPrice(bookEditionDTO.getPrice());
                bookEditionRepository.save(bookEdition);
            });
        }
        return book;
    }


    public BookDTO getBookById(Long bookId, boolean authorData) {

        Book book;
        List<BookAuthor> bookAuthors = null;

        book = bookRepository.findOne(bookId);

        if (authorData) {
            bookAuthors = bookAuthorRepository.findAllByBookId(bookId);
        }

        BookDTO bookDTO = new BookDTO();

   
        bookDTO.setId(book.getId());
        bookDTO.setName(book.getName());
        bookDTO.setDesc(book.getDesc());
        bookDTO.setYearOfPublication(book.getYearOfPublication());
        bookDTO.setBookType(book.getBookType());


        List<AuthorDTO> authorDTOList = new ArrayList<>();
        if (bookAuthors != null) {
            for (BookAuthor bookAuthor : bookAuthors) {
                Author author = bookAuthor.getAuthor();

                AuthorDTO authorDTO = new AuthorDTO();
                authorDTO.setId(author.getId());
                authorDTO.setName(author.getName());
                authorDTO.setGender(author.getGender());

                authorDTOList.add(authorDTO);
            }


            bookDTO.setAuthors(authorDTOList);
        }
        return bookDTO;
    }

    public Book updateBook(Book incomingBook) {
        return bookRepository.save(incomingBook);
    }

    public String deleteById(Long bookId) {
        bookRepository.delete(bookId);

        return "Deleted Successfully";
    }

    public APIResponse getBooksByRawQuery(Set<Integer> yop) {

        APIResponse apiResponse = new APIResponse();

        List<Book> bookList = bookRepository.findAllByYearOfPublicationIn(yop);

        BookData bookData = new BookData();
        bookData.setBooks(bookList);

        apiResponse.setData(bookData);

        return apiResponse;
    }

    public APIResponse getCaughtException(Integer yop) {

        int result = 100/yop;

        APIResponse response = new APIResponse();
        response.setData(result);

        return response;
    }

    public APIResponse getBooksByQueryDsl(Integer year) {
        APIResponse apiResponse = new APIResponse();

        List<BookQueryDslDTO> bookQueryDslDTOS = bookRepository.getAllBooksByQuerDslDto(year);

        apiResponse.setData(bookQueryDslDTOS);

        return apiResponse;
    }

    public APIResponse bulkService(BulkBooksRequestDTO bulkBooksRequestDTO) {

        List<Book> booksEntity = new ArrayList<>();


        for (int i = 0; i < 100000; i++) {
            Book book = new Book();

            book.setName("book-"+i);
            book.setDesc("book-"+i);
            book.setBookType("book-"+i);
            book.setYearOfPublication(2022);

            booksEntity.add(book);
        }

        bookRepository.save(booksEntity);

        return new APIResponse();
    }
}
