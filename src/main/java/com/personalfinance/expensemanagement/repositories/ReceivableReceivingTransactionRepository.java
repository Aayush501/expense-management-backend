package com.personalfinance.expensemanagement.repositories;

import com.personalfinance.expensemanagement.entities.ReceivableReceivingTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceivableReceivingTransactionRepository extends JpaRepository<ReceivableReceivingTransaction,String> {
}
