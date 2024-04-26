package com.engkisha.accounts.dto;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponseDTO {
    private String apipath;
    private HttpStatus errorCode;
    private String errorMessage;
    private LocalDateTime errorTime;

}
