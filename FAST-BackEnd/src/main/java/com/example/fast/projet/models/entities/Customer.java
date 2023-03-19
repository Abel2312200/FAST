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
public class Customer {
    @Id
    @SequenceGenerator(name = "customer_sequence", sequenceName = "customer_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_sequence")
    private Long customerId;

    private String personFirstName;

    private String personLastName;

    private String personMobile;

    private String personAdress;

    private String personEmail;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "queue_id", referencedColumnName = "queueId")
    private Queue queue;

    @OneToOne(mappedBy = "customer")
    private Ticket ticket;
    
    private Date waitingTime;

    private String operationType;

    private Boolean alreadyServed;

    private Date dateServed;

    private Date dateCreated;
    private Date dateUpdated;
    private Date dateDeleted;

}
