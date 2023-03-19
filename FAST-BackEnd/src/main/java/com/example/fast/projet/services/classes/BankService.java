package com.example.fast.projet.services.classes;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fast.projet.errors.entities_errors.BankNotFoundException;
import com.example.fast.projet.models.entities.Bank;
import com.example.fast.projet.repositories.BankRepository;
import com.example.fast.projet.services.interfaces.BankServiceImpl;

@Service
public class BankService implements BankServiceImpl {

    @Autowired
    private BankRepository bankRepository;

    @Override
    public Bank saveBank(Bank bank) {
        return bankRepository.save(bank);
    }

    @Override
    public List<Bank> fetchBankList() {
        return bankRepository.findAll();
    }

    @Override
    public Bank fetchBankById(long bankId) throws BankNotFoundException {

        Optional<Bank> bank = bankRepository.findById(bankId);

        if (!bank.isPresent()) {
            throw new BankNotFoundException("Department with" + bankId + "doesn't exist");
        }
        return bank.get();
    }

    @Override
    public void deleteBankById(long bankId) throws BankNotFoundException {

        Optional<Bank> bank = bankRepository.findById(bankId);

        if (!bank.isPresent()) {
            throw new BankNotFoundException("Department with" + bankId + "doesn't exist");
        }

        bankRepository.deleteById(bankId);

    }

    @Override
    public Bank updateBank(long bankId, Bank bank) throws BankNotFoundException {

        var bankToUpdate = bankRepository.findById(bankId).get();

        if (Objects.nonNull(bankToUpdate.getBankName())
                && !("".equalsIgnoreCase(bankToUpdate.getBankName())))
            bankToUpdate.setBankName(bank.getBankName());

        if (Objects.nonNull(bankToUpdate.getBankAdressHeadOffice())
                && !("".equalsIgnoreCase(bankToUpdate.getBankAdressHeadOffice())))
            bankToUpdate.setBankAdressHeadOffice(bank.getBankAdressHeadOffice());

        return bankRepository.save(bankToUpdate);

    }
    
    @Override
    public Bank fetchBankByName(String bankName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fetchBankByName'");
    }

    @Override
    public void deleteBankByName(long bankName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteBankByName'");
    }

    @Override
    public Bank fetchBankByNameIgnoreCase(String bankName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fetchBankByNameIgnoreCase'");
    }

}
