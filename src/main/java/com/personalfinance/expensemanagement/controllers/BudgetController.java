package com.personalfinance.expensemanagement.controllers;

import com.personalfinance.expensemanagement.dto.request.GenericRequest;
import com.personalfinance.expensemanagement.dto.response.GenericResponse;
import com.personalfinance.expensemanagement.services.BudgetServices;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/budget")
public class BudgetController {
    private final BudgetServices budgetServices;

    BudgetController(BudgetServices budgetServices) {
        this.budgetServices = budgetServices;
    }

    @GetMapping("/get/{month}/{year}")
    public ResponseEntity<GenericResponse> getBudgetForMonth(@PathVariable String month, @PathVariable String year) {
        return new ResponseEntity<>(budgetServices.getBudgetForMonth(month, year), HttpStatusCode.valueOf(200));
    }

    @PostMapping("/add/income")
    public ResponseEntity<GenericResponse> addIncome(@Valid @RequestBody GenericRequest dto) {
        return new ResponseEntity<>(budgetServices.addIncome(dto), HttpStatusCode.valueOf(201));
    }

    @PostMapping("/add/expected/expense")
    public ResponseEntity<GenericResponse> addExpectedExpense(@Valid @RequestBody GenericRequest dto) {
        return new ResponseEntity<>(budgetServices.addExpectedExpense(dto), HttpStatusCode.valueOf(201));
    }
}
