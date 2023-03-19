package com.example.fast.projet.models.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
            name = "agancy_sequence", sequenceName = "agency_sequence", allocationSize = 1)
    @GeneratedValue( // serves to definie constraints
            strategy = GenerationType.SEQUENCE, generator = "agency_sequence")
    private Long agencyId;

    private String agencyCode;

    private String agencyName;

    private String agencyMobile;

    private String agencyAdress;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "bank_id", referencedColumnName = "bankId")
    private Bank bank;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "agency_id", referencedColumnName = "agencyId")
    private List<Queue> queues;

    private Date dateCreated;
    private Date dateUpdated;
    private Date dateDeleted;

}
