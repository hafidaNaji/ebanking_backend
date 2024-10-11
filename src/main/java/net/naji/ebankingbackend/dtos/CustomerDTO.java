package net.naji.ebankingbackend.dtos;

import lombok.*;


@Getter @Setter @ToString
public class CustomerDTO {

    private Long id;
    private String name;
    private  String email;

}
