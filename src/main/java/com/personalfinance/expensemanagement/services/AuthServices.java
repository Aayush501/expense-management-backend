package com.personalfinance.expensemanagement.services;

import com.personalfinance.expensemanagement.dto.entitydto.UserDetails;
import com.personalfinance.expensemanagement.dto.request.*;
import com.personalfinance.expensemanagement.dto.response.DataCreationResponse;
import com.personalfinance.expensemanagement.dto.response.LoginResponse;
import jakarta.validation.Valid;

public interface AuthServices {
    DataCreationResponse registerUser(@Valid UserRegistrationRequest dto);

    LoginResponse loginUser(@Valid LoginRequest dto);

    Void editUserDetails(@Valid UserDetailsEditRequest dto, String username);

    UserDetails getUserDetails(String dto);

    Void deleteUserAccount(String dto, String username);

    Void editUserAccountPassword(@Valid UpdatePasswordRequest dto, String username);
}
