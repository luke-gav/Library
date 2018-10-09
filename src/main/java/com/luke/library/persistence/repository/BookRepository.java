package com.luke.library.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.luke.library.persistence.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
