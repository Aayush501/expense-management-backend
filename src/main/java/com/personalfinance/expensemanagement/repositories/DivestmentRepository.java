package com.personalfinance.expensemanagement.repositories;

import com.personalfinance.expensemanagement.entities.Divestment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DivestmentRepository extends JpaRepository<Divestment, String> {
}
