package com.example.fast.projet.repositories;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.fast.projet.entities.Bank;

@SpringBootTest
public class BankRepositoryTest {

    @Autowired
    private BankRepository bankRepository;

    @Test
    public void saveBank(){
        Bank bank = Bank.builder()
                    .bankName("NSIA Bank")
                    .bankAdressHeadOffice("Abidjan Plateaux Rue express")
                    .dateCreated(new Date())
                    .build();

        bankRepository.save(bank);
    }
}
