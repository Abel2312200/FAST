package com.example.fast.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fast.projet.models.entities.Queue;
import com.example.fast.projet.models.entities.Ticket;

@Repository
public interface QueueRepository extends JpaRepository<Queue, Long> {
    public Ticket findByTicketCode(String ticketCode);
}
