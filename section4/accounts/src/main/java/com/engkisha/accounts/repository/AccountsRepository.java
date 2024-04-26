package com.engkisha.accounts.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import com.engkisha.accounts.entity.Accounts;

import jakarta.transaction.Transactional;

import java.util.List;

public interface AccountsRepository extends JpaRepository<Accounts, Long> {
    Accounts findByCustomerId(Long customerId);

    @Transactional
    @Modifying
    void deleteByCustomerId(Long customerId);
}
