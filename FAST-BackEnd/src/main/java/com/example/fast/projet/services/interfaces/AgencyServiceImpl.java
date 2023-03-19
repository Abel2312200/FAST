package com.example.fast.projet.services.interfaces;

import java.util.List;

import com.example.fast.projet.errors.entities_errors.AgencyNotFoundException;
import com.example.fast.projet.models.entities.Agency;

public interface AgencyServiceImpl {
    public Agency saveAgency(Agency department);

    public List<Agency> fetchAgencyList();

    public Agency fetchAgencyById(long id) throws AgencyNotFoundException; 

    public void deleteAgencyById(long id) throws AgencyNotFoundException;

    public Agency updateAgency(long id, Agency agency) throws AgencyNotFoundException;

    public Agency fetchAgencyByName(String agencyName);

    public void deleteAgencyByName(String agencyName);

    public Agency fetchAgencyByNameIgnoreCase(String agencyName);
}
