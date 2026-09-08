package com.personalfinance.expensemanagement.dto.request;

import com.personalfinance.expensemanagement.constants.TablesAttributesValidationErrorMessages;
import com.personalfinance.expensemanagement.constants.TransactionType;
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
public class EditTransactionRequest {
    private String transactionId;

    @NotNull(message = "Date" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private LocalDate date;

    @NotBlank(message = "Description" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String description;

    @PositiveOrZero(message = "Amount" + TablesAttributesValidationErrorMessages.NOT_NEGATIVE)
    private double amount;

    @NotNull(message = "TransactionType" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private TransactionType transactionType;

    private String bankId;
    private String walletId;

    private boolean isIncome;
    private String incomeName;

    private boolean isExpectedExpense;
    private String expenseName;

    private boolean isInvestment;
    private String investmentName;

    private boolean isDebt;
    private String debtFrom;

    private boolean isReceivable;
    private String receivableGivenTo;
}
