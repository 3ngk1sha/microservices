package com.engkisha.accounts.service.impl;

import org.springframework.stereotype.Service;

import com.engkisha.accounts.dto.CustomerDTO;
import com.engkisha.accounts.repository.AccountsRepository;
import com.engkisha.accounts.repository.CustomerRepository;
import com.engkisha.accounts.service.IAccountsService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {
    private AccountsRepository accountsRepository;

    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDTO customerDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createAccount'");
    }

}
