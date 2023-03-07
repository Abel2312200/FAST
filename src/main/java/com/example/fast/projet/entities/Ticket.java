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
public class Ticket {
    @Id
    @SequenceGenerator(
        name = "ticket_sequence",
        sequenceName = "ticket_sequence",
        allocationSize = 1
    )
    @GeneratedValue( 
        strategy = GenerationType.SEQUENCE,
        generator = "ticket_sequence"
    )
    private Long ticketId;

    private String ticketCode;

    private Date dateCreated;

    private Date dateUpdated;

    private Date dateDeleted;
}
