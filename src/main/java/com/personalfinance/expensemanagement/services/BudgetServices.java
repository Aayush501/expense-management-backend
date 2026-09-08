package com.personalfinance.expensemanagement.services;

import com.personalfinance.expensemanagement.dto.request.AddExpectedExpenseRequest;
import com.personalfinance.expensemanagement.dto.request.AddIncomeRequest;
import com.personalfinance.expensemanagement.dto.response.BudgetForMonthResponse;
import com.personalfinance.expensemanagement.dto.response.DataCreationResponse;
import jakarta.validation.Valid;

public interface BudgetServices {
    BudgetForMonthResponse getBudgetForMonth(String month, String year, String s);

    DataCreationResponse addIncome(@Valid AddIncomeRequest dto, String username);

    DataCreationResponse addExpectedExpense(@Valid AddExpectedExpenseRequest dto, String username);
}
