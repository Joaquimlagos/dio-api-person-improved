package com.digitalinnovation.personapiimproved.repositories;

import com.digitalinnovation.personapiimproved.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}