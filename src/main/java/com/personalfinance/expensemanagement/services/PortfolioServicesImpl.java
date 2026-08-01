package com.personalfinance.expensemanagement.services;

import com.personalfinance.expensemanagement.dto.request.GenericRequest;
import com.personalfinance.expensemanagement.dto.response.GenericResponse;
import org.springframework.stereotype.Service;

@Service
public class PortfolioServicesImpl implements PortfolioServices {
    @Override
    public GenericResponse addNewInvestment(GenericRequest dto) {
        return null;
    }

    @Override
    public GenericResponse editInvestment(GenericRequest dto) {
        return null;
    }

    @Override
    public GenericResponse getInvestmentSummaryForUser(String username) {
        return null;
    }

    @Override
    public GenericResponse getInvestmentLedgerForUser(String username) {
        return null;
    }

    @Override
    public GenericResponse addNewDebt(GenericRequest dto) {
        return null;
    }

    @Override
    public GenericResponse editDebt(GenericRequest dto) {
        return null;
    }

    @Override
    public GenericResponse markDebtAsSettled(GenericRequest dto) {
        return null;
    }

    @Override
    public GenericResponse getRemainingDebtsForUser(String username) {
        return null;
    }

    @Override
    public GenericResponse getPaidDebtsForUser(String username) {
        return null;
    }

    @Override
    public GenericResponse addNewReceivable(GenericRequest dto) {
        return null;
    }

    @Override
    public GenericResponse editReceivable(GenericRequest dto) {
        return null;
    }

    @Override
    public GenericResponse markReceivableAsSettled(GenericRequest dto) {
        return null;
    }

    @Override
    public GenericResponse getRemainingReceivablesForUser(String username) {
        return null;
    }

    @Override
    public GenericResponse getReceivedReceivablesForUser(String username) {
        return null;
    }

    @Override
    public GenericResponse getInvestmentById(String investmentId) {
        return null;
    }

    @Override
    public GenericResponse getDebtById(String debtId) {
        return null;
    }

    @Override
    public GenericResponse getReceivableById(String receivableId) {
        return null;
    }
}
