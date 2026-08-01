package com.personalfinance.expensemanagement.repositories;

import com.personalfinance.expensemanagement.entities.Debt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DebtRepository extends JpaRepository<Debt, String> {
}
