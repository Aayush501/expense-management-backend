package com.personalfinance.expensemanagement.dto.request;

import com.personalfinance.expensemanagement.constants.TablesAttributesValidationErrorMessages;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetUserDetailsRequest {
    @NotBlank(message = "InvestmentName" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String username;
    private String systemIdentity;
    private String token;
}
