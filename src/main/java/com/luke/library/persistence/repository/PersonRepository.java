package com.luke.library.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.luke.library.persistence.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

}
