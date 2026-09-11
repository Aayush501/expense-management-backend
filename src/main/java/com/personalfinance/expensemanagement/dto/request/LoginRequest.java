package com.personalfinance.expensemanagement.dto.request;

import com.personalfinance.expensemanagement.constants.StandardPatternsOfApplication;
import com.personalfinance.expensemanagement.constants.TablesAttributesValidationErrorMessages;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {
    @NotBlank(message = "username" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String username;

    @NotEmpty(message = "Email" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    @Email(message = "Email" + TablesAttributesValidationErrorMessages.VALIDATION_ERROR)
    private String email;

    @NotEmpty(message = "password" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    @Pattern(regexp = StandardPatternsOfApplication.PASSWORD,
            message = TablesAttributesValidationErrorMessages.PASSWORD_VALIDATION_ERROR)
    private String password;
}
