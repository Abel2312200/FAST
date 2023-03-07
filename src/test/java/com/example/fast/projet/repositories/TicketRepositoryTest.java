package com.example.fast.projet.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.fast.projet.entities.Ticket;

@SpringBootTest
public class TicketRepositoryTest {

    @Autowired
    private TicketRepository ticketRepository;

    @Test
    public void saveTicket() {
        Ticket ticket =  Ticket.builder()
                        .ticketCode("Q1-001")
                        .build();

        ticketRepository.save(ticket);
    }

}
