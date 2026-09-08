package com.personalfinance.expensemanagement.services;

import com.personalfinance.expensemanagement.dto.request.AddExpectedExpenseRequest;
import com.personalfinance.expensemanagement.dto.request.AddIncomeRequest;
import com.personalfinance.expensemanagement.dto.response.BudgetForMonthResponse;
import com.personalfinance.expensemanagement.dto.response.DataCreationResponse;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class BudgetServicesImpl implements BudgetServices {
    @Override
    public BudgetForMonthResponse getBudgetForMonth(String month, String year, String s) {
        return null;
    }

    @Override
    public DataCreationResponse addIncome(@Valid AddIncomeRequest dto, String username) {
        return null;
    }

    @Override
    public DataCreationResponse addExpectedExpense(@Valid AddExpectedExpenseRequest dto, String username) {
        return null;
    }
}
