package com.java.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.java.model.Author;

@Repository
public interface AuthorRepository extends PagingAndSortingRepository<Author, Long> {

    Page<Author> findAllByOrderByIdDesc(Pageable pageable);
}
