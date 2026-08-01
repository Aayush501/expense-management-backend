package com.personalfinance.expensemanagement.controllers;

import com.personalfinance.expensemanagement.dto.request.GenericRequest;
import com.personalfinance.expensemanagement.dto.response.GenericResponse;
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

    @GetMapping("/get/bank/{bankId}")
    public ResponseEntity<GenericResponse> getTransactionsForBank(@PathVariable String bankId) {
        return new ResponseEntity<>(transactionServices.getTransactionsForBank(bankId), HttpStatusCode.valueOf(200));
    }

    @PostMapping("/add/transaction")
    public ResponseEntity<GenericResponse> addNewTransaction(@Valid @RequestBody GenericRequest dto) {
        return new ResponseEntity<>(transactionServices.addNewTransaction(dto), HttpStatusCode.valueOf(201));
    }

    @PatchMapping("/edit/transaction")
    public ResponseEntity<GenericResponse> editTransaction(@Valid @RequestBody GenericRequest dto) {
        return new ResponseEntity<>(transactionServices.editTransaction(dto), HttpStatusCode.valueOf(200));
    }

    @GetMapping("/get/{transactionId}")
    public ResponseEntity<GenericResponse> getTransactionById(@PathVariable String transactionId) {
        return new ResponseEntity<>(transactionServices.getTransactionById(transactionId), HttpStatusCode.valueOf(200));
    }
}
