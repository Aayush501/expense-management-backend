package com.personalfinance.expensemanagement.services;

import com.personalfinance.expensemanagement.dto.request.*;
import com.personalfinance.expensemanagement.dto.response.DataCreationResponse;
import com.personalfinance.expensemanagement.dto.response.SystemIdentityProvidingResponse;
import com.personalfinance.expensemanagement.dto.response.UserDetailsResponse;
import jakarta.validation.Valid;

public interface AuthServices {
    DataCreationResponse registerUser(@Valid UserRegistrationRequest dto);

    SystemIdentityProvidingResponse loginUser(@Valid LoginRequest dto);

    Void editUserDetails(@Valid UserDetailsEditRequest dto);

    UserDetailsResponse getUserDetails(@Valid GetUserDetailsRequest dto);

    Void deleteUserAccount(@Valid CoreAccountDetailUpdateRequest dto);

    Void editUserAccountPassword(@Valid CoreAccountDetailUpdateRequest dto);
}
