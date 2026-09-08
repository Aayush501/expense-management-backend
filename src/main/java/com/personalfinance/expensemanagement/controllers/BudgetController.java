package com.personalfinance.expensemanagement.controllers;

import com.personalfinance.expensemanagement.dto.request.AddExpectedExpenseRequest;
import com.personalfinance.expensemanagement.dto.request.AddIncomeRequest;
import com.personalfinance.expensemanagement.dto.response.BudgetForMonthResponse;
import com.personalfinance.expensemanagement.dto.response.DataCreationResponse;
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

    @GetMapping("/get/{username}/{month}/{year}")
    public ResponseEntity<BudgetForMonthResponse> getBudgetForMonth(@PathVariable String username,@PathVariable String month, @PathVariable String year) {
        return new ResponseEntity<>(budgetServices.getBudgetForMonth(username, month, year), HttpStatusCode.valueOf(200));
    }

    @PostMapping("/add/{username}/income")
    public ResponseEntity<DataCreationResponse> addIncome(@Valid @RequestBody AddIncomeRequest dto, @PathVariable String username) {
        return new ResponseEntity<>(budgetServices.addIncome(dto, username), HttpStatusCode.valueOf(201));
    }

    @PostMapping("/add/{username}/expected/expense")
    public ResponseEntity<DataCreationResponse> addExpectedExpense(@Valid @RequestBody AddExpectedExpenseRequest dto, @PathVariable String username) {
        return new ResponseEntity<>(budgetServices.addExpectedExpense(dto, username), HttpStatusCode.valueOf(201));
    }
}
