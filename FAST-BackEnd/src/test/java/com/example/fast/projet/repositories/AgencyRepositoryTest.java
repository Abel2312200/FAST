package com.example.fast.projet.repositories;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.fast.projet.models.entities.Agency;
import com.example.fast.projet.models.entities.Bank;


@SpringBootTest
public class AgencyRepositoryTest {

    @Autowired
    private AgencyRepository agencyRepository;

    @Test
    public void saveAgencyWithBank() {

        Bank bank = Bank.builder()
                .bankName("SGCI")
                .bankAdressHeadOffice("Abidjan Plateaux Rue 13")
                .dateCreated(new Date())
                .build();

        Agency agency = Agency.builder()
                        .agencyName("SGCI Marcory")
                        .agencyCode("SGCI002MARC")
                        .agencyAdress("Marcory Non lon")
                        .agencyMobile("0043303333")
                        .bank(bank)
                        .dateCreated(new Date())
                        .build();

        agencyRepository.save(agency);
    }

    @Test
    public void fetchAgencyByCode() {

        Agency agency = agencyRepository.findByAgencyCode("SGCI002MARC");

        System.out.println("Agency : "+agency);
        
    }

}
