package com.example.fast.projet.repositories;

import java.util.Date;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.fast.projet.entities.Agency;

@SpringBootTest
public class AgencyRepositoryTest {

    @Autowired
    private AgencyRepository agencyRepository;

    @Test
    @Disabled
    public void saveAgency() {

        Agency agency = Agency.builder()
                            .agencyCode("NSIA-YOP1")
                            .agencyName("NSIA Yopougoun I")
                            .agencyMobile("27 34 433 334")
                            .agencyAdress("Abidjan 232 BP Yop")
                            .dateCreated(new Date())
                            .build();

        agencyRepository.save(agency);
    }
}
