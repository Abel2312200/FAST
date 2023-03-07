package com.example.fast.projet.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {
    @Id
    @SequenceGenerator(
        name = "person_sequence",
        sequenceName = "person_sequence",
        allocationSize = 1
    )
    @GeneratedValue( 
        strategy = GenerationType.SEQUENCE,
        generator = "person_sequence"
    )
    private Long personId;

    private String firstNamePerson;

    private String lastNamePerson;

    private String mobilePerson;

    private String adressPerson;

    private String emailPerson;

    private Date dateCreated;

    private Date dateUpdated;

    private Date dateDeleted;
}
