package com.personalfinance.expensemanagement.dto.request;

import com.personalfinance.expensemanagement.constants.StandardPatternsOfApplication;
import com.personalfinance.expensemanagement.constants.TablesAttributesValidationErrorMessages;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EditBankDetailRequest {
    @NotBlank(message = "bankName" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String bankId;

    @NotBlank(message = "bankName" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String bankName;

    @NotNull(message = "linkedPhoneNumber" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    @Pattern(regexp = StandardPatternsOfApplication.PHONE,
            message = "Phone" + TablesAttributesValidationErrorMessages.VALIDATION_ERROR)
    private String linkedPhoneNumber;

    @NotEmpty(message = "linkedEmail" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    @Email(message = "Email" + TablesAttributesValidationErrorMessages.VALIDATION_ERROR)
    private String linkedEmail;
}
