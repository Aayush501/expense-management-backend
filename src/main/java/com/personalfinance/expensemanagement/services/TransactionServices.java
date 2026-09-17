package com.personalfinance.expensemanagement.services;

import com.personalfinance.expensemanagement.dto.request.AddAndEditTransactionRequest;
import com.personalfinance.expensemanagement.dto.response.DataCreationResponse;
import com.personalfinance.expensemanagement.dto.response.GetTransactionsResponse;
import jakarta.validation.Valid;

public interface TransactionServices {
    GetTransactionsResponse getTransactionsForBank(String bankId, String id);

    DataCreationResponse addNewTransaction(@Valid AddAndEditTransactionRequest dto, String username);

    Void editTransaction(@Valid AddAndEditTransactionRequest dto, String username, String transactionId);

    GetTransactionsResponse getTransactionById(String transactionId, String id);

    Void deleteTransactionById(String username, String transactionId);
}
