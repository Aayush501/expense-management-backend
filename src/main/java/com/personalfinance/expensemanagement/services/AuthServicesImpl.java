package com.personalfinance.expensemanagement.services;

import com.personalfinance.expensemanagement.dto.request.GenericRequest;
import com.personalfinance.expensemanagement.dto.response.GenericResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthServicesImpl implements AuthServices {
    @Override
    public GenericResponse registerUser(GenericRequest dto) {
        return null;
    }

    @Override
    public GenericResponse loginUser(GenericRequest dto) {
        return null;
    }

    @Override
    public Void editUserDetails(GenericRequest dto) {
        return null;
    }

    @Override
    public GenericResponse getUserDetails(GenericRequest dto) {
        return null;
    }

    @Override
    public Void deleteUserAccount(GenericRequest dto) {
        return null;
    }
}
