package net.naji.ebankingbackend.Entities;

import jakarta.persistence.*;
import lombok.*;
import net.naji.ebankingbackend.Entities.eums.OperationType;

import java.util.Date;

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString
public class AccountOperation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date operationDate;
    private double amount;
    @Enumerated(EnumType.STRING)
    private OperationType type;
    @ManyToOne
    private BankAccount bankAccount;
}
