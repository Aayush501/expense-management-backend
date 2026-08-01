package com.personalfinance.expensemanagement.services;

import com.personalfinance.expensemanagement.dto.request.*;
import com.personalfinance.expensemanagement.dto.response.GenericResponse;
import jakarta.validation.Valid;

public interface AuthServices {
    GenericResponse registerUser(@Valid GenericRequest dto);

    GenericResponse loginUser(@Valid GenericRequest dto);

    Void editUserDetails(@Valid GenericRequest dto);

    GenericResponse getUserDetails(@Valid GenericRequest dto);

    Void deleteUserAccount(@Valid GenericRequest dto);
}
