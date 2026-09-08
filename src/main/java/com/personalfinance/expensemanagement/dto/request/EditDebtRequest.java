package com.personalfinance.expensemanagement.dto.request;

import com.personalfinance.expensemanagement.constants.DebtAndReceivableStatus;
import com.personalfinance.expensemanagement.constants.TablesAttributesValidationErrorMessages;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EditDebtRequest {
    private String debtId;

    @PositiveOrZero(message = "Amount" + TablesAttributesValidationErrorMessages.NOT_NEGATIVE)
    private double amount;

    @NotBlank(message = "TakenFrom" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String takenFrom;

    @NotNull(message = "Date" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private LocalDate date;

    @NotBlank(message = "Description" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String description;

    @NotNull(message = "DebtStatus" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private DebtAndReceivableStatus status;
}
