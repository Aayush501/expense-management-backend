package com.personalfinance.expensemanagement.repositories;

import com.personalfinance.expensemanagement.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletsRepository extends JpaRepository<Wallet, String> {
}
