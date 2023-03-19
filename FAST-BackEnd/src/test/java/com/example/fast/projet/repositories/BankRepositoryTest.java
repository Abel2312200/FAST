package com.example.fast.projet.repositories;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.fast.projet.models.entities.Bank;

@SpringBootTest
public class BankRepositoryTest {

    @Autowired
    private BankRepository bankRepository;

    @Test
    public void saveBankWithoutAgencies() {
        
        Bank bank = Bank.builder()
                    .bankName("NSIA")
                    .bankAdressHeadOffice("Abidjan Plateaux Rue 12")
                    .dateCreated(new Date())
                    .build();

        bankRepository.save(bank);
    }

}
