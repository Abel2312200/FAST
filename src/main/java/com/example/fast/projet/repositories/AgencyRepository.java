package com.example.fast.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fast.projet.entities.Agency;

@Repository
public interface AgencyRepository extends JpaRepository<Agency, Long> {
    
}
