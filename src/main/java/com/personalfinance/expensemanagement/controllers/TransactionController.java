package com.personalfinance.expensemanagement.controllers;

import com.personalfinance.expensemanagement.dto.request.AddTransactionRequest;
import com.personalfinance.expensemanagement.dto.request.EditTransactionRequest;
import com.personalfinance.expensemanagement.dto.response.DataCreationResponse;
import com.personalfinance.expensemanagement.dto.response.GetTransactionsResponse;
import com.personalfinance.expensemanagement.services.TransactionServices;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ledger/transaction")
public class TransactionController {
    private final TransactionServices transactionServices;

    TransactionController(TransactionServices transactionServices) {
        this.transactionServices = transactionServices;
    }

    @GetMapping("/get/bank/{username}/{bankId}")
    public ResponseEntity<GetTransactionsResponse> getTransactionsForBank(@PathVariable String username, @PathVariable String bankId) {
        return new ResponseEntity<>(transactionServices.getTransactionsForBank(username, bankId), HttpStatusCode.valueOf(200));
    }

    @PostMapping("/add/{username}/transaction")
    public ResponseEntity<DataCreationResponse> addNewTransaction(@Valid @RequestBody AddTransactionRequest dto, @PathVariable String username) {
        return new ResponseEntity<>(transactionServices.addNewTransaction(dto, username), HttpStatusCode.valueOf(201));
    }

    @PatchMapping("/edit/{username}/transaction")
    public ResponseEntity<Void> editTransaction(@Valid @RequestBody EditTransactionRequest dto, @PathVariable String username) {
        return new ResponseEntity<>(transactionServices.editTransaction(dto, username), HttpStatusCode.valueOf(200));
    }

    @GetMapping("/get/{username}/{transactionId}")
    public ResponseEntity<GetTransactionsResponse> getTransactionById(@PathVariable String username, @PathVariable String transactionId) {
        return new ResponseEntity<>(transactionServices.getTransactionById(username, transactionId), HttpStatusCode.valueOf(200));
    }

    @DeleteMapping("/delete/{username}/{transactionId}")
    public ResponseEntity<Void> deleteTransaction(@PathVariable String username, @PathVariable String transactionId) {
        return new ResponseEntity<>(transactionServices.deleteTransactionById(username, transactionId), HttpStatusCode.valueOf(204));
    }
}
