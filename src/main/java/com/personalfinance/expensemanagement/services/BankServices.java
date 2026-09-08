package com.personalfinance.expensemanagement.services;

import com.personalfinance.expensemanagement.dto.request.AddBankRequest;
import com.personalfinance.expensemanagement.dto.request.EditBankDetailRequest;
import com.personalfinance.expensemanagement.dto.response.BanksListResponse;
import com.personalfinance.expensemanagement.dto.response.DataCreationResponse;
import jakarta.validation.Valid;

public interface BankServices {
    DataCreationResponse addBank(@Valid AddBankRequest dto);

    Void editBank(@Valid EditBankDetailRequest dto);

    BanksListResponse getBanksForUser(String username);

    BanksListResponse getBankById(String bankId);
}
