package com.personalfinance.expensemanagement.dto.request;

import com.personalfinance.expensemanagement.constants.InvestmentType;
import com.personalfinance.expensemanagement.constants.TablesAttributesValidationErrorMessages;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddInvestmentRequest {
    @NotBlank(message = "InvestmentName" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String investmentName;

    @NotBlank(message = TablesAttributesValidationErrorMessages.IMPOSSIBLE_TO_ADD + "username")
    private String username;

    @NotNull(message = "InvestmentType" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private InvestmentType type;

    @PositiveOrZero(message = "Amount" + TablesAttributesValidationErrorMessages.NOT_NEGATIVE)
    private double installmentAmount;

    @Positive(message = "Cumulative" + TablesAttributesValidationErrorMessages.POSITIVE)
    @NotNull(message = TablesAttributesValidationErrorMessages.IMPOSSIBLE_TO_ADD + "Cumulative")
    private Long cumulative;

    @PositiveOrZero(message = "Payment" + TablesAttributesValidationErrorMessages.NOT_NEGATIVE)
    private Double payment;

    @PositiveOrZero(message = "CurrentValue" + TablesAttributesValidationErrorMessages.NOT_NEGATIVE)
    private Double currentValue;
}
