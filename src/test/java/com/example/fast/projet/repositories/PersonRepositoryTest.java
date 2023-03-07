package com.example.fast.projet.repositories;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.fast.projet.entities.Person;

@SpringBootTest
public class PersonRepositoryTest {

    @Autowired
    private PersonRepository  personRepository;

    @Test
    public void savePerson() {
        
        Person person = Person.builder()
                        .firstNamePerson("Abel")
                        .lastNamePerson("Ngbandaman")
                        .mobilePerson("01 53 480 944")
                        .emailPerson("abel@gmail.com")
                        .adressPerson("Yopougon Niangon")
                        .dateCreated(new Date())
                        .build();
        
        personRepository.save(person);
    }
}
