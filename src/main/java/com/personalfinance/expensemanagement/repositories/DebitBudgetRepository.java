package com.personalfinance.expensemanagement.repositories;

import com.personalfinance.expensemanagement.entities.DebitBudget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DebitBudgetRepository extends JpaRepository<DebitBudget, String> {
}
