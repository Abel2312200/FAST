package com.example.fast.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fast.projet.models.entities.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
    
    public Person findByPersonEmail(String email);
}
