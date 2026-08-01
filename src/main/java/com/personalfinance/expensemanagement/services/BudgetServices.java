package com.personalfinance.expensemanagement.services;

import com.personalfinance.expensemanagement.dto.request.GenericRequest;
import com.personalfinance.expensemanagement.dto.response.GenericResponse;
import jakarta.validation.Valid;

public interface BudgetServices {
    GenericResponse getBudgetForMonth(String month, String year);

    GenericResponse addIncome(@Valid GenericRequest dto);

    GenericResponse addExpectedExpense(@Valid GenericRequest dto);
}
