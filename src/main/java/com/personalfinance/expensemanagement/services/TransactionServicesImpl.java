package com.personalfinance.expensemanagement.services;

import com.personalfinance.expensemanagement.dto.request.AddTransactionRequest;
import com.personalfinance.expensemanagement.dto.request.EditTransactionRequest;
import com.personalfinance.expensemanagement.dto.response.DataCreationResponse;
import com.personalfinance.expensemanagement.dto.response.GetTransactionsResponse;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class TransactionServicesImpl implements TransactionServices {
    @Override
    public GetTransactionsResponse getTransactionsForBank(String bankId, String id) {
        return null;
    }

    @Override
    public DataCreationResponse addNewTransaction(@Valid AddTransactionRequest dto, String username) {
        return null;
    }

    @Override
    public Void editTransaction(@Valid EditTransactionRequest dto, String username) {
        return null;
    }

    @Override
    public GetTransactionsResponse getTransactionById(String transactionId, String id) {
        return null;
    }

    @Override
    public Void deleteTransactionById(String username, String transactionId) {
        return null;
    }
}
