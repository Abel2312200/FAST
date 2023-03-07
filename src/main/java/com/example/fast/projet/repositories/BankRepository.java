package com.example.fast.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fast.projet.entities.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {
    
}
