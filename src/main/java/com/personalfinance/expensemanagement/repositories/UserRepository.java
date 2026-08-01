package com.personalfinance.expensemanagement.repositories;

import com.personalfinance.expensemanagement.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
