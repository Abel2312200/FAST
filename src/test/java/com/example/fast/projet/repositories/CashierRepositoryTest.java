package com.example.fast.projet.repositories;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.fast.projet.entities.Cashier;

@SpringBootTest
public class CashierRepositoryTest {

    @Autowired
    private CashierRepository cashierRepository;

    @Test
    public void saveCashier() {

        Cashier cashier = Cashier.builder()
                        .cashierMatricule("NSIA-YOP N1")
                        .dateCreated(new Date())
                        .build();

        cashierRepository.save(cashier); 
    }
}
