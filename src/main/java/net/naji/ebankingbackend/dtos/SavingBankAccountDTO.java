package net.naji.ebankingbackend.dtos;
import lombok.*;
import net.naji.ebankingbackend.entities.eums.AccountStatus;
import java.util.Date;



 @Getter @Setter @ToString

public  class SavingBankAccountDTO extends BankAccountDTO{
     private String id;
    private  double balance;
    private Date createdAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double interestRate;

   }
