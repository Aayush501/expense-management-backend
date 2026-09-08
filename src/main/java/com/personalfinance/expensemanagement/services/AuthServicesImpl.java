package com.personalfinance.expensemanagement.services;

import com.personalfinance.expensemanagement.dto.request.*;
import com.personalfinance.expensemanagement.dto.response.DataCreationResponse;
import com.personalfinance.expensemanagement.dto.response.SystemIdentityProvidingResponse;
import com.personalfinance.expensemanagement.dto.response.UserDetailsResponse;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class AuthServicesImpl implements AuthServices {
    @Override
    public DataCreationResponse registerUser(@Valid UserRegistrationRequest dto) {
        return null;
    }

    @Override
    public SystemIdentityProvidingResponse loginUser(@Valid LoginRequest dto) {
        return null;
    }

    @Override
    public Void editUserDetails(@Valid UserDetailsEditRequest dto) {
        return null;
    }

    @Override
    public UserDetailsResponse getUserDetails(@Valid GetUserDetailsRequest dto) {
        return null;
    }

    @Override
    public Void deleteUserAccount(@Valid CoreAccountDetailUpdateRequest dto) {
        return null;
    }

    @Override
    public Void editUserAccountPassword(@Valid CoreAccountDetailUpdateRequest dto) {
        return null;
    }
}
