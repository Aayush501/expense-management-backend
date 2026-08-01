package com.personalfinance.expensemanagement.services;

import com.personalfinance.expensemanagement.dto.request.GenericRequest;
import com.personalfinance.expensemanagement.dto.response.GenericResponse;
import org.springframework.stereotype.Service;

@Service
public class TransactionServicesImpl implements TransactionServices {
    @Override
    public GenericResponse getTransactionsForBank(String bankId) {
        return null;
    }

    @Override
    public GenericResponse addNewTransaction(GenericRequest dto) {
        return null;
    }

    @Override
    public GenericResponse editTransaction(GenericRequest dto) {
        return null;
    }

    @Override
    public GenericResponse getTransactionById(String transactionId) {
        return null;
    }
}
