package com.personalfinance.expensemanagement.services;

import com.personalfinance.expensemanagement.dto.request.GenericRequest;
import com.personalfinance.expensemanagement.dto.response.GenericResponse;
import org.springframework.stereotype.Service;

@Service
public class BudgetServicesImpl implements BudgetServices {
    @Override
    public GenericResponse getBudgetForMonth(String month, String year) {
        return null;
    }

    @Override
    public GenericResponse addIncome(GenericRequest dto) {
        return null;
    }

    @Override
    public GenericResponse addExpectedExpense(GenericRequest dto) {
        return null;
    }
}
