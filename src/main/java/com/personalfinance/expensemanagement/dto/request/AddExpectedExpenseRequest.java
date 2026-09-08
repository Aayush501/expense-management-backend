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
    @NotBlank(message = TablesAttributesValidationErrorMessages.IMPOSSIBLE_TO_ADD + "username")
    private String username;

    @NotNull(message = "Month" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private MonthNames month;

    @NotBlank(message = "Year" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String year;

    @NotBlank(message = "ExpenseName" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String expenseName;

    @PositiveOrZero(message = "ExpectedAmount" + TablesAttributesValidationErrorMessages.NOT_NEGATIVE)
    private Double expectedAmount;

    @PositiveOrZero(message = "ActualAmount" + TablesAttributesValidationErrorMessages.NOT_NEGATIVE)
    private Double actualAmount;
}
