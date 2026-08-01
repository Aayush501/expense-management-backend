package com.personalfinance.expensemanagement.repositories;

import com.personalfinance.expensemanagement.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
