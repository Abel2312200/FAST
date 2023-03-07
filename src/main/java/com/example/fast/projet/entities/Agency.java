package com.example.fast.projet.entities;

import java.time.LocalDate;
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
public class Agency {
    
    @Id
    @SequenceGenerator( // to review
        name = "agancy_sequence",
        sequenceName = "agency_sequence",
        allocationSize = 1
    )
    @GeneratedValue( // serves to definie constraints
        strategy = GenerationType.SEQUENCE,
        generator = "agency_sequence"
    )
    private Long agencyId;

    private String agencyCode;

    private String agencyName;

    private String agencyMobile;

    private String agencyAdress;

    private Date dateCreated;

    private Date dateUpdated;

    private Date dateDeleted;
}
