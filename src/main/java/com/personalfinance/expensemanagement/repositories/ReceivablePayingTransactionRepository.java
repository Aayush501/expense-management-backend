package com.personalfinance.expensemanagement.repositories;

import com.personalfinance.expensemanagement.entities.ReceivablePayingTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceivablePayingTransactionRepository extends JpaRepository<ReceivablePayingTransaction,String> {
}
