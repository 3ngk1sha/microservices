package com.engkisha.accounts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDTO {
    @NotEmpty(message = "Name can not be a null or empty")
    @Size(min = 5, max = 30, message = "the length should be between 5 and 30")
    private String name;

    @NotEmpty(message = "Email address cannot be empty")
    @Email(message = "Email address should be valid value")
    private String email;

    @NotEmpty(message = "not null")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must have 10 number")
    private String mobileNumber;

    private AccountsDTO accountsDTO;
}
