package com.personalfinance.expensemanagement.repositories;

import com.personalfinance.expensemanagement.entities.DebtPayingTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DebtPayingTransactionRepository extends JpaRepository<DebtPayingTransaction,String> {
}
