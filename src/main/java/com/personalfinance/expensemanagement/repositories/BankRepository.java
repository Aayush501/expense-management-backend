package com.personalfinance.expensemanagement.repositories;

import com.personalfinance.expensemanagement.entities.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, String> {
}
