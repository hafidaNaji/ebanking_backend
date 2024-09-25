package net.naji.ebankingbackend.Entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@DiscriminatorValue("CA")
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString
public class CurrentAccount extends BankAccount {
    private double overDraft;

}
