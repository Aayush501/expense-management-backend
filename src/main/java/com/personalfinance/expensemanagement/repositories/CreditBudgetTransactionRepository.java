package com.personalfinance.expensemanagement.repositories;

import com.personalfinance.expensemanagement.entities.CreditBudgetTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditBudgetTransactionRepository extends JpaRepository<CreditBudgetTransaction,String> {
}
