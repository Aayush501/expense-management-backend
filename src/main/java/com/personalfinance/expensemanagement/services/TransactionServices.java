package com.personalfinance.expensemanagement.services;

import com.personalfinance.expensemanagement.dto.request.GenericRequest;
import com.personalfinance.expensemanagement.dto.response.GenericResponse;
import jakarta.validation.Valid;

public interface TransactionServices {
    GenericResponse getTransactionsForBank(String bankId);

    GenericResponse addNewTransaction(@Valid GenericRequest dto);

    GenericResponse editTransaction(@Valid GenericRequest dto);

    GenericResponse getTransactionById(String transactionId);
}
