package com.personalfinance.expensemanagement.services;

import com.personalfinance.expensemanagement.constants.DebtAndReceivableStatus;
import com.personalfinance.expensemanagement.dto.request.*;
import com.personalfinance.expensemanagement.dto.response.*;
import jakarta.validation.Valid;

public interface PortfolioServices {
    DataCreationResponse addNewInvestment(@Valid AddInvestmentRequest dto, String username);

    Void editInvestment(@Valid EditInvestmentRequest dto, String username);

    GetInvestmentResponse getInvestmentSummaryForUser(String username);

    InvestmentLedgerResponse getInvestmentLedgerForUser(String username);

    DataCreationResponse addNewDebt(@Valid AddNewDebtRequest dto, String username);

    Void editDebt(@Valid EditDebtRequest dto, String username);

    Void markDebtAsSettled(@Valid EditDebtRequest dto, String username);

    DataCreationResponse addNewReceivable(@Valid AddReceivableRequest dto, String username);

    Void markReceivableAsSettled(@Valid EditReceivableRequest dto, String username);

    GetInvestmentResponse getInvestmentById(String investmentId);

    GetDebtsResponse getDebtById(String debtId);

    GetReceivablesResponse getReceivableById(String receivableId);

    GetDebtsResponse getDebtsForUser(String username, DebtAndReceivableStatus status);

    Void editReceivable(@Valid EditReceivableRequest dto, String username);

    GetReceivablesResponse getReceivablesForUser(String username, DebtAndReceivableStatus status);
}
