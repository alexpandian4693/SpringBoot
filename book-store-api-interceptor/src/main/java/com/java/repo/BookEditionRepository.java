package com.java.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.java.model.BookEdition;

@Repository
public interface BookEditionRepository extends CrudRepository<BookEdition, Long> {
}
