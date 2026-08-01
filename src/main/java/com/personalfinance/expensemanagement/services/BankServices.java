package com.personalfinance.expensemanagement.services;

import com.personalfinance.expensemanagement.dto.request.GenericRequest;
import com.personalfinance.expensemanagement.dto.response.GenericResponse;
import jakarta.validation.Valid;

public interface BankServices {
    GenericResponse addBank(@Valid GenericRequest dto);

    Void editBank(@Valid GenericRequest dto);

    GenericResponse getBanksForUser(String username);

    GenericResponse getBankById(String bankId);
}
