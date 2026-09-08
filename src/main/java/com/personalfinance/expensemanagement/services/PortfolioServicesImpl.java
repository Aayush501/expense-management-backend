package com.personalfinance.expensemanagement.services;

import com.personalfinance.expensemanagement.constants.DebtAndReceivableStatus;
import com.personalfinance.expensemanagement.dto.request.*;
import com.personalfinance.expensemanagement.dto.response.*;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class PortfolioServicesImpl implements PortfolioServices {
    @Override
    public DataCreationResponse addNewInvestment(@Valid AddInvestmentRequest dto, String username) {
        return null;
    }

    @Override
    public Void editInvestment(@Valid EditInvestmentRequest dto, String username) {
        return null;
    }

    @Override
    public GetInvestmentResponse getInvestmentSummaryForUser(String username) {
        return null;
    }

    @Override
    public InvestmentLedgerResponse getInvestmentLedgerForUser(String username) {
        return null;
    }

    @Override
    public DataCreationResponse addNewDebt(@Valid AddNewDebtRequest dto, String username) {
        return null;
    }

    @Override
    public Void editDebt(@Valid EditDebtRequest dto, String username) {
        return null;
    }

    @Override
    public Void markDebtAsSettled(@Valid EditDebtRequest dto, String username) {
        return null;
    }

    @Override
    public DataCreationResponse addNewReceivable(@Valid AddReceivableRequest dto, String username) {
        return null;
    }

    @Override
    public Void markReceivableAsSettled(@Valid EditReceivableRequest dto, String username) {
        return null;
    }

    @Override
    public GetInvestmentResponse getInvestmentById(String investmentId) {
        return null;
    }

    @Override
    public GetDebtsResponse getDebtById(String debtId) {
        return null;
    }

    @Override
    public GetReceivablesResponse getReceivableById(String receivableId) {
        return null;
    }

    @Override
    public GetDebtsResponse getDebtsForUser(String username, DebtAndReceivableStatus status) {
        return null;
    }

    @Override
    public Void editReceivable(EditReceivableRequest dto, String username) {
        return null;
    }

    @Override
    public GetReceivablesResponse getReceivablesForUser(String username, DebtAndReceivableStatus status) {
        return null;
    }
}
