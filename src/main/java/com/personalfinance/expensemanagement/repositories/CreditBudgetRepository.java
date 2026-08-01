package com.personalfinance.expensemanagement.repositories;

import com.personalfinance.expensemanagement.entities.CreditBudget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditBudgetRepository extends JpaRepository<CreditBudget, String> {
}
