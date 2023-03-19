package com.example.fast.projet.services.classes;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.fast.projet.models.entities.Bank;

@SpringBootTest
public class BankServiceTest {

    @Autowired
    private BankService bankService;

    @Test
    void testDeleteBankByBankName() {

    }

    @Test
    void testDeleteBankById() {

    }

    @Test
    void testFetchBankByBankName() {

    }

    @Test
    void testFetchBankById() {

    }

    @Test
    void testFetchBankList() {

    }

    @Test
    void testFetchDepartmentByBankNameIgnoreCase() {

    }

    @Test
    void testSaveBank() {
        Bank bank = Bank.builder()
        .bankName("BCICI")
        .bankAdressHeadOffice("Abidjan Plateaux Rue 12")
        .dateCreated(new Date())
        .build(); 

        bankService.saveBank(bank);
    }

    @Test
    void testUpdateBank() {

    }
}
