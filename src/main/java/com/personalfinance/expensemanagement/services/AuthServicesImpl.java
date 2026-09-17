package com.personalfinance.expensemanagement.services;

import com.personalfinance.expensemanagement.dto.entitydto.UserDetails;
import com.personalfinance.expensemanagement.dto.request.*;
import com.personalfinance.expensemanagement.dto.response.DataCreationResponse;
import com.personalfinance.expensemanagement.dto.response.LoginResponse;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class AuthServicesImpl implements AuthServices {
    @Override
    public DataCreationResponse registerUser(@Valid UserRegistrationRequest dto) {
        return null;
    }

    @Override
    public LoginResponse loginUser(@Valid LoginRequest dto) {
        return null;
    }

    @Override
    public Void editUserDetails(@Valid UserDetailsEditRequest dto, String username) {
        return null;
    }

    @Override
    public UserDetails getUserDetails(String dto) {
        return null;
    }

    @Override
    public Void deleteUserAccount(String dto, String username) {
        return null;
    }

    @Override
    public Void editUserAccountPassword(@Valid UpdatePasswordRequest dto, String username) {
        return null;
    }
}
