package net.naji.ebankingbackend.entities;

import jakarta.persistence.*;
import lombok.*;
import net.naji.ebankingbackend.entities.eums.AccountStatus;

import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE",length = 4)
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString

public abstract class BankAccount {
    @Id
    private String id;
    private  double balance;
    private Date createdAt;
    @Enumerated(EnumType.STRING)
    private AccountStatus status;
    @ManyToOne
    private Customer customer;
    @OneToMany(mappedBy = "bankAccount",fetch = FetchType.EAGER)
    private List<AccountOperation> accountOperations;
}
