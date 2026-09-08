package com.personalfinance.expensemanagement.controllers;

import com.personalfinance.expensemanagement.constants.DebtAndReceivableStatus;
import com.personalfinance.expensemanagement.dto.request.*;
import com.personalfinance.expensemanagement.dto.response.*;
import com.personalfinance.expensemanagement.services.PortfolioServices;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/portfolio")
public class PortfolioController {
    private final PortfolioServices portfolioServices;

    PortfolioController(PortfolioServices portfolioServices) {
        this.portfolioServices = portfolioServices;
    }

    @PostMapping("/add/{username}/investment")
    public ResponseEntity<DataCreationResponse> addNewInvestment(@Valid @RequestBody AddInvestmentRequest dto, @PathVariable String username) {
        return new ResponseEntity<>(portfolioServices.addNewInvestment(dto, username), HttpStatusCode.valueOf(201));
    }

    @PatchMapping("/edit/{username}/investment")
    public ResponseEntity<Void> editInvestment(@Valid @RequestBody EditInvestmentRequest dto, @PathVariable String username) {
        return new ResponseEntity<>(portfolioServices.editInvestment(dto, username), HttpStatusCode.valueOf(204));
    }

    @GetMapping("/get/investment/summary/{username}")
    public ResponseEntity<GetInvestmentResponse> getInvestmentSummaryForUser(@PathVariable String username) {
        return new ResponseEntity<>(portfolioServices.getInvestmentSummaryForUser(username), HttpStatusCode.valueOf(200));
    }

    @GetMapping("/get/investment/ledger/{username}")
    public ResponseEntity<InvestmentLedgerResponse> getInvestmentLedgerForUser(@PathVariable String username) {
        return new ResponseEntity<>(portfolioServices.getInvestmentLedgerForUser(username), HttpStatusCode.valueOf(200));
    }

    @PostMapping("/add/{username}/debt")
    public ResponseEntity<DataCreationResponse> addNewDebt(@Valid @RequestBody AddNewDebtRequest dto, @PathVariable String username) {
        return new ResponseEntity<>(portfolioServices.addNewDebt(dto, username), HttpStatusCode.valueOf(201));
    }

    @PatchMapping("/edit/{username}/debt")
    public ResponseEntity<Void> editDebt(@Valid @RequestBody EditDebtRequest dto, @PathVariable String username) {
        return new ResponseEntity<>(portfolioServices.editDebt(dto, username), HttpStatusCode.valueOf(204));
    }

    @PatchMapping("/debt/settle/{username}")
    public ResponseEntity<Void> markDebtAsSettled(@Valid @RequestBody EditDebtRequest dto, @PathVariable String username) {
        return new ResponseEntity<>(portfolioServices.markDebtAsSettled(dto, username), HttpStatusCode.valueOf(204));
    }

    @GetMapping("/debts/get/{username}/{status}")
    public ResponseEntity<GetDebtsResponse> getDebtsForUser(@PathVariable String username, @PathVariable DebtAndReceivableStatus status) {
        return new ResponseEntity<>(portfolioServices.getDebtsForUser(username, status), HttpStatusCode.valueOf(200));
    }

    @PostMapping("/add/{username}/receivable")
    public ResponseEntity<DataCreationResponse> addNewReceivable(@Valid @RequestBody AddReceivableRequest dto, @PathVariable String username) {
        return new ResponseEntity<>(portfolioServices.addNewReceivable(dto, username), HttpStatusCode.valueOf(201));
    }

    @PatchMapping("/edit/{username}/receivable")
    public ResponseEntity<Void> editReceivable(@Valid @RequestBody EditReceivableRequest dto, @PathVariable String username) {
        return new ResponseEntity<>(portfolioServices.editReceivable(dto, username), HttpStatusCode.valueOf(204));
    }

    @PatchMapping("/receivable/settle/{username}")
    public ResponseEntity<Void> markReceivableAsSettled(@Valid @RequestBody EditReceivableRequest dto, @PathVariable String username) {
        return new ResponseEntity<>(portfolioServices.markReceivableAsSettled(dto, username), HttpStatusCode.valueOf(204));
    }

    @GetMapping("/receivable/get/{username}/{status}")
    public ResponseEntity<GetReceivablesResponse> getReceivablesForUser(@PathVariable String username, @PathVariable DebtAndReceivableStatus status) {
        return new ResponseEntity<>(portfolioServices.getReceivablesForUser(username, status), HttpStatusCode.valueOf(200));
    }

    @GetMapping("/get/investment/{investmentId}")
    public ResponseEntity<GetInvestmentResponse> getInvestmentById(@PathVariable String investmentId) {
        return new ResponseEntity<>(portfolioServices.getInvestmentById(investmentId), HttpStatusCode.valueOf(200));
    }

    @GetMapping("/get/debt/{debtId}")
    public ResponseEntity<GetDebtsResponse> getDebtById(@PathVariable String debtId) {
        return new ResponseEntity<>(portfolioServices.getDebtById(debtId), HttpStatusCode.valueOf(200));
    }

    @GetMapping("/get/receivable/{receivableId}")
    public ResponseEntity<GetReceivablesResponse> getReceivableById(@PathVariable String receivableId) {
        return new ResponseEntity<>(portfolioServices.getReceivableById(receivableId), HttpStatusCode.valueOf(200));
    }
}
