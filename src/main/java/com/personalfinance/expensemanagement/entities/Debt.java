package com.personalfinance.expensemanagement.entities;

import com.personalfinance.expensemanagement.constants.DebtAndReceivableStatus;
import com.personalfinance.expensemanagement.constants.TablesAttributesValidationErrorMessages;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "debts")
public class Debt {
    @Id
    private String debtId;

    @NotBlank(message = TablesAttributesValidationErrorMessages.IMPOSSIBLE_TO_ADD + "username")
    @Column(name = "username", insertable=false, updatable=false)
    private String username;

    @PositiveOrZero(message = "Amount" + TablesAttributesValidationErrorMessages.NOT_NEGATIVE)
    private double amount;

    @NotBlank(message = "TakenFrom" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String takenFrom;

    @NotNull(message = "Date" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private LocalDate date;

    @NotBlank(message = "Description" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String description;

    @NotNull(message = "DebtStatus" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    @Enumerated(EnumType.STRING)
    private DebtAndReceivableStatus status;

    @ManyToOne(
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(name = "username")
    private User user;
}
