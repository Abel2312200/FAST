package com.example.fast.projet.services.classes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.OpAnd;
import org.springframework.stereotype.Service;

import com.example.fast.projet.errors.entities_errors.AgencyNotFoundException;
import com.example.fast.projet.models.entities.Agency;
import com.example.fast.projet.repositories.AgencyRepository;
import com.example.fast.projet.services.interfaces.AgencyServiceImpl;

@Service
public class AgencyService implements AgencyServiceImpl {

    @Autowired
    private AgencyRepository agencyRepository;

    @Override
    public Agency saveAgency(Agency agency) {

        return agencyRepository.save(agency);
    }

    @Override
    public List<Agency> fetchAgencyList() {
        return agencyRepository.findAll();
    }

    @Override
    public Agency fetchAgencyById(long id) throws AgencyNotFoundException {
        Optional<Agency> agencyToCheck = agencyRepository.findById(id);

        if(!agencyToCheck.isPresent())
            throw new AgencyNotFoundException("Agency with this id :"+id+"doesn't exist.");

        Agency agency = agencyRepository.findById(id).get();

        return agency;
    }

    @Override
    public void deleteAgencyById(long id) throws AgencyNotFoundException {
        Optional<Agency> agencyToCheck = agencyRepository.findById(id);

        if(!agencyToCheck.isPresent())
            throw new AgencyNotFoundException("Agency with this id :"+id+"doesn't exist.");

        agencyRepository.deleteById(id);
    }

    @Override
    public Agency updateAgency(long id, Agency agency) throws AgencyNotFoundException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAgency'");
    }

    @Override
    public Agency fetchAgencyByName(String agencyName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fetchAgencyByName'");
    }

    @Override
    public void deleteAgencyByName(String agencyName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAgencyByName'");
    }

    @Override
    public Agency fetchAgencyByNameIgnoreCase(String agencyName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fetchAgencyByNameIgnoreCase'");
    }
    
}
