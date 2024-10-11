package net.naji.ebankingbackend.mappers;

import net.naji.ebankingbackend.dtos.AccountOperationDTO;
import net.naji.ebankingbackend.dtos.CurrentBankAccountDTO;
import net.naji.ebankingbackend.dtos.CustomerDTO;
import net.naji.ebankingbackend.dtos.SavingBankAccountDTO;
import net.naji.ebankingbackend.entities.AccountOperation;
import net.naji.ebankingbackend.entities.CurrentAccount;
import net.naji.ebankingbackend.entities.Customer;
import net.naji.ebankingbackend.entities.SavingAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

//MapsStruct
@Service
public class BankAccountMapperImpl {
    public CustomerDTO fromCustomer(Customer customer){
        CustomerDTO customerDTO=new CustomerDTO();
        BeanUtils.copyProperties(customer,customerDTO);//pour simplifier les écritures pour ne pas faire beaucoup de set
        //customerDTO.setId(customer.getId());
        //customerDTO.setName(customer.getName());
        //customerDTO.setEmail(customer.getEmail());
        return customerDTO;
    }
    public Customer fromCustomerDTO(CustomerDTO customerDTO){
        Customer customer=new Customer();
        BeanUtils.copyProperties(customerDTO,customer);//pour simplifier les écritures pour ne pas faire beaucoup de set
        return customer;
    }
    public SavingBankAccountDTO fromSavingBankAccount(SavingAccount savingAccount){
      SavingBankAccountDTO savingBankAccountDTO=new SavingBankAccountDTO();
      BeanUtils.copyProperties(savingAccount,savingBankAccountDTO);
      savingBankAccountDTO.setCustomerDTO(fromCustomer(savingAccount.getCustomer()));
      savingBankAccountDTO.setType(savingAccount.getClass().getSimpleName());
      return savingBankAccountDTO;
    }
    public SavingAccount  fromSavingBankAccountDTO(SavingBankAccountDTO savingBankAccountDTO){
         SavingAccount savingAccount=new SavingAccount();
         BeanUtils.copyProperties(savingBankAccountDTO,savingAccount);
         savingAccount.setCustomer(fromCustomerDTO(savingBankAccountDTO.getCustomerDTO()));
         return savingAccount;
    }
    public CurrentBankAccountDTO fromCurrentBankAccount(CurrentAccount currentAccount){
         CurrentBankAccountDTO currentBankAccountDTO=new CurrentBankAccountDTO();
         BeanUtils.copyProperties(currentAccount,currentBankAccountDTO);
         currentBankAccountDTO.setCustomerDTO(fromCustomer(currentAccount.getCustomer()));
        currentBankAccountDTO.setType(currentAccount.getClass().getSimpleName());
         return currentBankAccountDTO;
    }
    public CurrentAccount fromCurrentBankAccountDTO(CurrentBankAccountDTO currentBankAccountDTO){
         CurrentAccount currentAccount=new CurrentAccount();
         BeanUtils.copyProperties(currentBankAccountDTO,currentAccount);
         currentAccount.setCustomer(fromCustomerDTO(currentBankAccountDTO.getCustomerDTO()));
         return currentAccount;
    }
    public AccountOperationDTO fromAccountOperation(AccountOperation accountOperation){
        AccountOperationDTO accountOperationDTO=new AccountOperationDTO();
        BeanUtils.copyProperties(accountOperation,accountOperationDTO);
        return accountOperationDTO;
    }




}