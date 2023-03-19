package com.example.fast.projet.services.interfaces;

import java.util.List;

import com.example.fast.projet.errors.entities_errors.BankNotFoundException;
import com.example.fast.projet.models.entities.Bank;

public interface BankServiceImpl {
    public Bank saveBank(Bank department);

    public List<Bank> fetchBankList();

    public Bank fetchBankById(long id) throws BankNotFoundException; 

    public void deleteBankById(long id) throws BankNotFoundException;

    public Bank updateBank(long id, Bank bank) throws BankNotFoundException;

    public Bank fetchBankByName(String bankName);

    public void deleteBankByName(long bankName);

    public Bank fetchBankByNameIgnoreCase(String bankName);
}
