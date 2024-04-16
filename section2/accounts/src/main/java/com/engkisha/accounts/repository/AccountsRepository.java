package com.engkisha.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.engkisha.accounts.entity.Accounts;

public interface AccountsRepository extends JpaRepository<Accounts, Long> {

}
