package com.engkisha.accounts.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.engkisha.accounts.entity.Accounts;
import java.util.List;

public interface AccountsRepository extends JpaRepository<Accounts, Long> {
    Accounts findByCustomerId(Long customerId);
}
