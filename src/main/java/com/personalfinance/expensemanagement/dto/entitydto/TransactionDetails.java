package com.personalfinance.expensemanagement.dto.entitydto;

import com.personalfinance.expensemanagement.constants.TablesAttributesValidationErrorMessages;
import com.personalfinance.expensemanagement.constants.TransactionType;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionDetails {
    private String transactionId;
    private LocalDate date;
    private String description;
    private Double amount;
    private TransactionType transactionType;
    private String bankId;
    private String walletId;
    private Double balanceAfterThisTransaction;
}
