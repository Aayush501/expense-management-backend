package com.personalfinance.expensemanagement.services;

import com.personalfinance.expensemanagement.dto.request.GenericRequest;
import com.personalfinance.expensemanagement.dto.response.GenericResponse;
import org.springframework.stereotype.Service;

@Service
public class BankServicesImpl implements BankServices {
    @Override
    public GenericResponse addBank(GenericRequest dto) {
        return null;
    }

    @Override
    public Void editBank(GenericRequest dto) {
        return null;
    }

    @Override
    public GenericResponse getBanksForUser(String username) {
        return null;
    }

    @Override
    public GenericResponse getBankById(String bankId) {
        return null;
    }
}
