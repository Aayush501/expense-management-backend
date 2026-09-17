package com.personalfinance.expensemanagement.controllers;

import com.personalfinance.expensemanagement.dto.request.AddBankRequest;
import com.personalfinance.expensemanagement.dto.request.EditBankDetailRequest;
import com.personalfinance.expensemanagement.dto.response.BanksListResponse;
import com.personalfinance.expensemanagement.dto.response.DataCreationResponse;
import com.personalfinance.expensemanagement.services.BankServices;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bank")
public class BankController {
    private final BankServices bankServices;

    BankController(BankServices bankServices) {
        this.bankServices = bankServices;
    }

    @PostMapping("/{username}/add")
    public ResponseEntity<DataCreationResponse> addBank(
            @Valid @RequestBody AddBankRequest dto,
            @PathVariable String username) {
        return new ResponseEntity<>(bankServices.addBank(dto, username), HttpStatusCode.valueOf(201));
    }

    @PatchMapping("/{username}/edit/{bankId}")
    public ResponseEntity<Void> editBank(@Valid @RequestBody EditBankDetailRequest dto, @PathVariable String bankId) {
        return new ResponseEntity<>(bankServices.editBank(dto, bankId), HttpStatusCode.valueOf(200));
    }

    @GetMapping("/user/get/{username}")
    public ResponseEntity<BanksListResponse> getBanksForUser(@PathVariable String username) {
        return new ResponseEntity<>(bankServices.getBanksForUser(username), HttpStatusCode.valueOf(200));
    }

    @GetMapping("/get/{bankId}")
    public ResponseEntity<BanksListResponse> getBankById(@PathVariable String bankId) {
        return new ResponseEntity<>(bankServices.getBankById(bankId), HttpStatusCode.valueOf(200));
    }
}
