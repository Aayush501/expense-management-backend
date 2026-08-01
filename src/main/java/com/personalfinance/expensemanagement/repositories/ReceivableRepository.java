package com.personalfinance.expensemanagement.repositories;

import com.personalfinance.expensemanagement.entities.Receivable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceivableRepository extends JpaRepository<Receivable, String> {
}
