package com.personalfinance.expensemanagement.services;

import com.personalfinance.expensemanagement.dto.request.GenericRequest;
import com.personalfinance.expensemanagement.dto.response.GenericResponse;
import jakarta.validation.Valid;

public interface PortfolioServices {
    GenericResponse addNewInvestment(@Valid GenericRequest dto);

    GenericResponse editInvestment(@Valid GenericRequest dto);

    GenericResponse getInvestmentSummaryForUser(String username);

    GenericResponse getInvestmentLedgerForUser(String username);

    GenericResponse addNewDebt(@Valid GenericRequest dto);

    GenericResponse editDebt(@Valid GenericRequest dto);

    GenericResponse markDebtAsSettled(@Valid GenericRequest dto);

    GenericResponse getRemainingDebtsForUser(String username);

    GenericResponse getPaidDebtsForUser(String username);

    GenericResponse addNewReceivable(@Valid GenericRequest dto);

    GenericResponse editReceivable(@Valid GenericRequest dto);

    GenericResponse markReceivableAsSettled(@Valid GenericRequest dto);

    GenericResponse getRemainingReceivablesForUser(String username);

    GenericResponse getReceivedReceivablesForUser(String username);

    GenericResponse getInvestmentById(String investmentId);

    GenericResponse getDebtById(String debtId);

    GenericResponse getReceivableById(String receivableId);
}
