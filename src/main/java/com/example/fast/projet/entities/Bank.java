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
public class Bank {
    @Id
    @SequenceGenerator( 
        name = "bank_sequence",
        sequenceName = "bank_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "bank_sequence"
    )
    private Long bankId;

    private String bankName;

    private String bankAdressHeadOffice;
    
    private Date dateCreated;

    private Date dateUpdated;

    private Date dateDeleted;
}
