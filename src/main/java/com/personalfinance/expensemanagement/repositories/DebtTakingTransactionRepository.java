package com.personalfinance.expensemanagement.repositories;

import com.personalfinance.expensemanagement.entities.DebtTakingTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DebtTakingTransactionRepository extends JpaRepository<DebtTakingTransaction,String> {
}
