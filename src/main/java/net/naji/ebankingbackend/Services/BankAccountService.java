package net.naji.ebankingbackend.Services;

import net.naji.ebankingbackend.dtos.*;
import net.naji.ebankingbackend.exception.BalanceNotSufficientException;
import net.naji.ebankingbackend.exception.BankAccountNotException;
import net.naji.ebankingbackend.exception.BankAccountNotFoundException;
import net.naji.ebankingbackend.exceptions.CustomerNotFoundException;

import java.util.List;

public interface BankAccountService {

    CustomerDTO saveCustomer(CustomerDTO customerDTO);

    CurrentBankAccountDTO saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId) throws CustomerNotFoundException;

    SavingBankAccountDTO saveSavingBankAccount(double initialBalance, double interestRate, Long customerId) throws CustomerNotFoundException;

    List<CustomerDTO>listCustomers();

    BankAccountDTO getBankAccount(String accountId) throws BankAccountNotException, BankAccountNotFoundException;

    void debit(String accountId, double amount,String description) throws BankAccountNotFoundException, BalanceNotSufficientException;
    void credit(String accountId,double amount,String description) throws BankAccountNotFoundException;
    void transfer(String accountIdSource, String accountIdDestination,double amount ) throws BankAccountNotFoundException, BalanceNotSufficientException;


    List<BankAccountDTO> bankAccountList();

    CustomerDTO getCustomer(Long customerId) throws CustomerNotFoundException;

    CustomerDTO updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(Long customerId);

    List<AccountOperationDTO>accountHistory(String accountId);

    AccountHistoryDTO getAccountHistory(String accountId, int page, int size) throws BankAccountNotFoundException;
}
