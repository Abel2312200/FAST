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
public class Customer {
    @Id
    @SequenceGenerator(
        name = "customer_sequence",
        sequenceName = "customer_sequence",
        allocationSize = 1
    )
    @GeneratedValue( 
        strategy = GenerationType.SEQUENCE,
        generator = "customer_sequence"
    )
    private Long customerId;

    private Date waitingTime;

    private String operationType;

    private Boolean alreadyServed;

    private Date dateServed;

    private Date dateCreated;

    private Date dateUpdated;

    private Date dateDeleted;

}
