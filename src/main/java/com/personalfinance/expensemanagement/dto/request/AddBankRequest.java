package com.personalfinance.expensemanagement.dto.request;

import com.personalfinance.expensemanagement.constants.StandardPatternsOfApplication;
import com.personalfinance.expensemanagement.constants.TablesAttributesValidationErrorMessages;
import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AddBankRequest {
    @NotBlank(message = "bankName" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String bankName;

    @NotBlank(message = TablesAttributesValidationErrorMessages.IMPOSSIBLE_TO_ADD + "username")
    private String username;

    @NotNull(message = TablesAttributesValidationErrorMessages.IMPOSSIBLE_TO_ADD + "balance")
    @PositiveOrZero(message = "balance" + TablesAttributesValidationErrorMessages.NOT_NEGATIVE)
    private Double balance;

    @Pattern(regexp = StandardPatternsOfApplication.PHONE,
            message = "Phone" + TablesAttributesValidationErrorMessages.VALIDATION_ERROR)
    private String linkedPhoneNumber;

    @Email(message = "Email" + TablesAttributesValidationErrorMessages.VALIDATION_ERROR)
    private String linkedEmail;
}
