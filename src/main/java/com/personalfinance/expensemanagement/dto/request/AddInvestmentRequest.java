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

    @NotNull(message = "InvestmentType" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private InvestmentType type;

    @NotNull(message = "installmentAmount" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    @PositiveOrZero(message = "Amount" + TablesAttributesValidationErrorMessages.NOT_NEGATIVE)
    private Double installmentAmount;

    @Positive(message = "Cumulative" + TablesAttributesValidationErrorMessages.POSITIVE)
    @NotNull(message = TablesAttributesValidationErrorMessages.IMPOSSIBLE_TO_ADD + "Cumulative")
    private Long cumulative;

    @NotNull(message = "payment" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    @PositiveOrZero(message = "Payment" + TablesAttributesValidationErrorMessages.NOT_NEGATIVE)
    private Double payment;

    @NotNull(message = "currentValue" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    @PositiveOrZero(message = "CurrentValue" + TablesAttributesValidationErrorMessages.NOT_NEGATIVE)
    private Double currentValue;
}
