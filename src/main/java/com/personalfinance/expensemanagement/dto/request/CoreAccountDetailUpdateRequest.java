package com.personalfinance.expensemanagement.dto.request;

import com.personalfinance.expensemanagement.constants.StandardPatternsOfApplication;
import com.personalfinance.expensemanagement.constants.TablesAttributesValidationErrorMessages;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CoreAccountDetailUpdateRequest {
    @NotBlank(message = TablesAttributesValidationErrorMessages.IMPOSSIBLE_TO_ADD + "username")
    private String username;

    @NotNull(message = "Password" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    @Pattern(regexp = StandardPatternsOfApplication.PASSWORD,
            message = TablesAttributesValidationErrorMessages.PASSWORD_VALIDATION_ERROR)
    private String password;
    private String systemIdentity;
    private String token;
}
