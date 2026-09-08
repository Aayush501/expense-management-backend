package com.personalfinance.expensemanagement.dto.request;

import com.personalfinance.expensemanagement.constants.InvestmentType;
import com.personalfinance.expensemanagement.constants.TablesAttributesValidationErrorMessages;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EditInvestmentRequest {
    private String investmentId;

    @NotBlank(message = "InvestmentName" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String investmentName;

    @NotNull(message = "InvestmentType" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private InvestmentType type;
}
