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
public class AddExpectedExpenseRequest {
    @NotNull(message = "Month" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private MonthNames month;

    @NotBlank(message = "Year" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String year;

    @NotBlank(message = "ExpenseName" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String expenseName;

    @NotNull(message = "expectedAmount" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    @PositiveOrZero(message = "ExpectedAmount" + TablesAttributesValidationErrorMessages.NOT_NEGATIVE)
    private Double expectedAmount;

    @NotNull(message = "actualAmount" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    @PositiveOrZero(message = "ActualAmount" + TablesAttributesValidationErrorMessages.NOT_NEGATIVE)
    private Double actualAmount;
}
