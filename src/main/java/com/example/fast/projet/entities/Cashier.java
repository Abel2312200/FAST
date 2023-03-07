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
public class Cashier {
    @Id
    @SequenceGenerator(
        name = "cashier_sequence",
        sequenceName = "cashier_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "cashier_sequence"
    )
    private Long cashierId;

    private String cashierMatricule;

    private Date dateCreated;

    private Date dateUpdated;

    private Date dateDeleted;
}
