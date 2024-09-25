package net.naji.ebankingbackend.Entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@DiscriminatorValue("SA")
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString
public class SavingAccount extends  BankAccount{
    private double interestRate;
}
