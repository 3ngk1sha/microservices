package com.engkisha.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDTO {
    @NotEmpty
    @Pattern(regexp = "(^$|[0-9]{10}", message = "Mobile number must have 10 number")
    private Long accountNumber;

    @NotEmpty(message = "Account type cant be a null")
    private String accountType;

    @NotEmpty(message = "adress cant not null")
    private String branchAddress;
}
