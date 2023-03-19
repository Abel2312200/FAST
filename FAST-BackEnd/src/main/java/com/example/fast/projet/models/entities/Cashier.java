package com.example.fast.projet.models.entities;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
    @SequenceGenerator(name = "cashier_sequence", sequenceName = "cashier_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cashier_sequence")
    private Long cashierId;

    private String cashierMatricule;

    @OneToOne(mappedBy = "cashier")
    private Queue queue;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "agency_id", referencedColumnName = "agencyId")
    private Agency agency;
    private String personFirstName;

    private String personLastName;

    private String personMobile;

    private String personAdress;

    private String personEmail;
    
    private Date dateCreated;
    private Date dateUpdated;
    private Date dateDeleted;
}
