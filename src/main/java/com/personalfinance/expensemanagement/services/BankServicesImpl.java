package com.personalfinance.expensemanagement.services;

import com.personalfinance.expensemanagement.dto.request.AddBankRequest;
import com.personalfinance.expensemanagement.dto.request.EditBankDetailRequest;
import com.personalfinance.expensemanagement.dto.response.BanksListResponse;
import com.personalfinance.expensemanagement.dto.response.DataCreationResponse;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class BankServicesImpl implements BankServices {
    @Override
    public DataCreationResponse addBank(@Valid AddBankRequest dto) {
        return null;
    }

    @Override
    public Void editBank(@Valid EditBankDetailRequest dto) {
        return null;
    }

    @Override
    public BanksListResponse getBanksForUser(String username) {
        return null;
    }

    @Override
    public BanksListResponse getBankById(String bankId) {
        return null;
    }
}
