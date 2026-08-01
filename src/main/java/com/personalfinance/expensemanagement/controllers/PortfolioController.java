package com.personalfinance.expensemanagement.controllers;

import com.personalfinance.expensemanagement.dto.request.GenericRequest;
import com.personalfinance.expensemanagement.dto.response.GenericResponse;
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

    @PostMapping("/add/investment")
    public ResponseEntity<GenericResponse> addNewInvestment(@Valid @RequestBody GenericRequest dto) {
        return new ResponseEntity<>(portfolioServices.addNewInvestment(dto), HttpStatusCode.valueOf(201));
    }

    @PatchMapping("/edit/investment")
    public ResponseEntity<GenericResponse> editInvestment(@Valid @RequestBody GenericRequest dto) {
        return new ResponseEntity<>(portfolioServices.editInvestment(dto), HttpStatusCode.valueOf(200));
    }

    @GetMapping("/get/investment/summary/{username}")
    public ResponseEntity<GenericResponse> getInvestmentSummaryForUser(@PathVariable String username) {
        return new ResponseEntity<>(portfolioServices.getInvestmentSummaryForUser(username), HttpStatusCode.valueOf(200));
    }

    @GetMapping("/get/investment/ledger/{username}")
    public ResponseEntity<GenericResponse> getInvestmentLedgerForUser(@PathVariable String username) {
        return new ResponseEntity<>(portfolioServices.getInvestmentLedgerForUser(username), HttpStatusCode.valueOf(200));
    }

    @PostMapping("/add/debt")
    public ResponseEntity<GenericResponse> addNewDebt(@Valid @RequestBody GenericRequest dto) {
        return new ResponseEntity<>(portfolioServices.addNewDebt(dto), HttpStatusCode.valueOf(201));
    }

    @PatchMapping("/edit/debt")
    public ResponseEntity<GenericResponse> editDebt(@Valid @RequestBody GenericRequest dto) {
        return new ResponseEntity<>(portfolioServices.editDebt(dto), HttpStatusCode.valueOf(200));
    }

    @PatchMapping("/debt/settle")
    public ResponseEntity<GenericResponse> markDebtAsSettled(@Valid @RequestBody GenericRequest dto) {
        return new ResponseEntity<>(portfolioServices.markDebtAsSettled(dto), HttpStatusCode.valueOf(200));
    }

    @GetMapping("/debts/get/remaining/{username}")
    public ResponseEntity<GenericResponse> getRemainingDebtsForUser(@PathVariable String username) {
        return new ResponseEntity<>(portfolioServices.getRemainingDebtsForUser(username), HttpStatusCode.valueOf(200));
    }

    @GetMapping("/debts/get/paid/{username}")
    public ResponseEntity<GenericResponse> getPaidDebtsForUser(@PathVariable String username) {
        return new ResponseEntity<>(portfolioServices.getPaidDebtsForUser(username), HttpStatusCode.valueOf(200));
    }

    @PostMapping("/add/receivable")
    public ResponseEntity<GenericResponse> addNewReceivable(@Valid @RequestBody GenericRequest dto) {
        return new ResponseEntity<>(portfolioServices.addNewReceivable(dto), HttpStatusCode.valueOf(201));
    }

    @PatchMapping("/edit/receivable")
    public ResponseEntity<GenericResponse> editReceivable(@Valid @RequestBody GenericRequest dto) {
        return new ResponseEntity<>(portfolioServices.editReceivable(dto), HttpStatusCode.valueOf(200));
    }

    @PatchMapping("/receivable/settle")
    public ResponseEntity<GenericResponse> markReceivableAsSettled(@Valid @RequestBody GenericRequest dto) {
        return new ResponseEntity<>(portfolioServices.markReceivableAsSettled(dto), HttpStatusCode.valueOf(200));
    }

    @GetMapping("/receivable/get/remaining/{username}")
    public ResponseEntity<GenericResponse> getRemainingReceivablesForUser(@PathVariable String username) {
        return new ResponseEntity<>(portfolioServices.getRemainingReceivablesForUser(username), HttpStatusCode.valueOf(200));
    }

    @GetMapping("/receivable/get/received/{username}")
    public ResponseEntity<GenericResponse> getReceivedReceivablesForUser(@PathVariable String username) {
        return new ResponseEntity<>(portfolioServices.getReceivedReceivablesForUser(username), HttpStatusCode.valueOf(200));
    }

    @GetMapping("/get/investment/{investmentId}")
    public ResponseEntity<GenericResponse> getInvestmentById(@PathVariable String investmentId) {
        return new ResponseEntity<>(portfolioServices.getInvestmentById(investmentId), HttpStatusCode.valueOf(200));
    }

    @GetMapping("/get/debt/{debtId}")
    public ResponseEntity<GenericResponse> getDebtById(@PathVariable String debtId) {
        return new ResponseEntity<>(portfolioServices.getDebtById(debtId), HttpStatusCode.valueOf(200));
    }

    @GetMapping("/get/receivable/{receivableId}")
    public ResponseEntity<GenericResponse> getReceivableById(@PathVariable String receivableId) {
        return new ResponseEntity<>(portfolioServices.getReceivableById(receivableId), HttpStatusCode.valueOf(200));
    }
}
