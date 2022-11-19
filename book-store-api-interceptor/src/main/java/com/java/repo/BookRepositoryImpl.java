package com.java.repo;

import com.java.dto.BookQueryDslDTO;
import com.java.model.Book;
import com.java.model.QBook;
import com.querydsl.core.Tuple;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.QBean;
import com.querydsl.jpa.impl.JPAQuery;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements BookRepositoryCustom{

    @PersistenceContext
    EntityManager em;

    public static QBook qBook = QBook.book;

    @Override
    public List<Book> getAllBooksByQuerDsl(Integer year) {
 
        JPAQuery<Book> jpaQuery = new JPAQuery<>(em);

       

        QBean<Book> bookQBean = Projections.bean(Book.class,
                qBook.id,
                qBook.bookType
        );

        List<Book> books =  jpaQuery
                .from(qBook)
                .where(qBook.yearOfPublication.eq(year))
                .select(bookQBean)
                .fetch();

     
        return books;
    }

    @Override
    public List<BookQueryDslDTO> getAllBooksByQuerDslDto(Integer year) {

        JPAQuery<BookQueryDslDTO> jpaQuery = new JPAQuery<>(em);

        QBean<BookQueryDslDTO> dslDTOQBean = Projections.bean(BookQueryDslDTO.class,
                qBook.id,
                qBook.bookType.as("type")
        );

        List<BookQueryDslDTO> books = jpaQuery
                .select(dslDTOQBean)
                .from(qBook)
                .where(qBook.yearOfPublication.eq(year))
                .fetch();

        return books;
    }

}
