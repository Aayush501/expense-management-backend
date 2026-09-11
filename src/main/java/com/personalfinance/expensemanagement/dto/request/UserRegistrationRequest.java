package com.personalfinance.expensemanagement.dto.request;

import com.personalfinance.expensemanagement.constants.StandardPatternsOfApplication;
import com.personalfinance.expensemanagement.constants.TablesAttributesValidationErrorMessages;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRegistrationRequest {
    @NotEmpty(message = "firstName" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String firstName;

    @NotEmpty(message = "lastName" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String lastName;

    @NotEmpty(message = "Email" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    @Email(message = "Email" + TablesAttributesValidationErrorMessages.VALIDATION_ERROR)
    private String email;

    @NotEmpty(message = "phone" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    @Pattern(regexp = StandardPatternsOfApplication.PHONE,
            message = "Phone" + TablesAttributesValidationErrorMessages.VALIDATION_ERROR)
    private String phone;

    @NotBlank(message = "username" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String username;

    @NotEmpty(message = "password" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    @Pattern(regexp = StandardPatternsOfApplication.PASSWORD,
            message = TablesAttributesValidationErrorMessages.PASSWORD_VALIDATION_ERROR)
    private String password;
}
