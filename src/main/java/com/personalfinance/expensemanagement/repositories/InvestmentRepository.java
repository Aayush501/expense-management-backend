package com.personalfinance.expensemanagement.repositories;

import com.personalfinance.expensemanagement.entities.Investment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestmentRepository extends JpaRepository<Investment, String> {
}
