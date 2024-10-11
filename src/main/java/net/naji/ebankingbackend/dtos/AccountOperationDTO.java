package net.naji.ebankingbackend.dtos;

import lombok.*;
import net.naji.ebankingbackend.entities.eums.OperationType;

import java.util.Date;


@Data
public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private String description;
}
