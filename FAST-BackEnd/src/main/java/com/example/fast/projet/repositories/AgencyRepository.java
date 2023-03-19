package com.example.fast.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fast.projet.models.entities.Agency;

@Repository
public interface AgencyRepository extends JpaRepository<Agency, Long> {
    
    public Agency findByAgencyCode(String Code);
}
