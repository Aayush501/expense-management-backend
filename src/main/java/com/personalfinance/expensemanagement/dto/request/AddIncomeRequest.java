package com.personalfinance.expensemanagement.dto.request;

import com.personalfinance.expensemanagement.constants.MonthNames;
import com.personalfinance.expensemanagement.constants.TablesAttributesValidationErrorMessages;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddIncomeRequest {
    @NotNull(message = "Month" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private MonthNames month;

    @NotBlank(message = "Year" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String year;

    @NotBlank(message = "IncomeName" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String incomeName;

    @NotNull(message = "Amount" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    @PositiveOrZero(message = "Amount" + TablesAttributesValidationErrorMessages.NOT_NEGATIVE)
    private Double amount;
}
