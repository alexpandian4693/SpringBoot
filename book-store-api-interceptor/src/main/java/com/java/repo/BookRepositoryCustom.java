package com.java.repo;

import com.java.dto.BookQueryDslDTO;
import com.java.model.Book;

import java.util.List;

public interface BookRepositoryCustom {

    public List<Book> getAllBooksByQuerDsl(Integer year);

    public List<BookQueryDslDTO> getAllBooksByQuerDslDto(Integer year);

}
