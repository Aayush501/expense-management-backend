package com.personalfinance.expensemanagement.dto.request;

import com.personalfinance.expensemanagement.constants.StandardPatternsOfApplication;
import com.personalfinance.expensemanagement.constants.TablesAttributesValidationErrorMessages;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EditBankDetailRequest {
    private String bankId;

    @NotBlank(message = "bankName" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String bankName;

    @Pattern(regexp = StandardPatternsOfApplication.PHONE,
            message = "Phone" + TablesAttributesValidationErrorMessages.VALIDATION_ERROR)
    private String linkedPhoneNumber;

    @Email(message = "Email" + TablesAttributesValidationErrorMessages.VALIDATION_ERROR)
    private String linkedEmail;
}
