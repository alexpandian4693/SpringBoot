package com.java.repo;

import org.springframework.data.repository.CrudRepository;

import com.java.model.BookAuthor;

import java.util.List;

public interface BookAuthorRepository extends CrudRepository<BookAuthor, Long> {

    List<BookAuthor> findAllByBookId(Long bookId);
}
