package com.personalfinance.expensemanagement.repositories;

import com.personalfinance.expensemanagement.entities.DebitBudgetTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DebitBudgetTransactionRepository extends JpaRepository<DebitBudgetTransaction,String> {
}
