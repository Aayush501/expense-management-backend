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
public class EditReceivableRequest {
    private String receivableId;

    @NotBlank(message = "GivenTo" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String givenTo;

    @PositiveOrZero(message = "Amount" + TablesAttributesValidationErrorMessages.NOT_NEGATIVE)
    private double amount;

    @NotNull(message = "Date" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private LocalDate date;

    @NotBlank(message = "Description" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String description;

    @NotNull(message = "ReceivableStatus" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private DebtAndReceivableStatus status;
}
