package com.example.fast.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fast.projet.models.entities.Cashier;

@Repository
public interface CashierRepository extends JpaRepository<Cashier, Long> {
    
    public Cashier findByPersonEmail(String email);

}
