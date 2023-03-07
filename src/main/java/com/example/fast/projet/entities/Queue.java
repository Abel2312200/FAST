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
public class Queue {
    @Id
    @SequenceGenerator( 
        name = "queue_sequence",
        sequenceName = "queue_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "queue_sequence"
    )
    private Long queueId;

    private String queueCode;
    
    private Integer queueSize;

    private Date dateCreated;

    private Date dateUpdated;

    private Date dateDeleted;
}

