package com.personalfinance.expensemanagement.repositories;

import com.personalfinance.expensemanagement.entities.InvestmentInstallment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestmentInstallmentRepository extends JpaRepository<InvestmentInstallment, String> {
}
