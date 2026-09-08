package com.personalfinance.expensemanagement.services;

import com.personalfinance.expensemanagement.dto.request.AddTransactionRequest;
import com.personalfinance.expensemanagement.dto.request.EditTransactionRequest;
import com.personalfinance.expensemanagement.dto.response.DataCreationResponse;
import com.personalfinance.expensemanagement.dto.response.GetTransactionsResponse;
import jakarta.validation.Valid;

public interface TransactionServices {
    GetTransactionsResponse getTransactionsForBank(String bankId, String id);

    DataCreationResponse addNewTransaction(@Valid AddTransactionRequest dto, String username);

    Void editTransaction(@Valid EditTransactionRequest dto, String username);

    GetTransactionsResponse getTransactionById(String transactionId, String id);

    Void deleteTransactionById(String username, String transactionId);
}
