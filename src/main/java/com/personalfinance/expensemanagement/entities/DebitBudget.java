package com.personalfinance.expensemanagement.entities;

import com.personalfinance.expensemanagement.constants.MonthNames;
import com.personalfinance.expensemanagement.constants.TablesAttributesValidationErrorMessages;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "debitBudget")
public class DebitBudget {
    @Id
    private String debitBudgetId;

    @NotBlank(message = TablesAttributesValidationErrorMessages.IMPOSSIBLE_TO_ADD + "username")
    @Column(name = "username", insertable=false, updatable=false)
    private String username;

    @NotNull(message = "Month" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    @Enumerated(EnumType.STRING)
    private MonthNames month;

    @NotBlank(message = "Year" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String year;

    @NotBlank(message = "ExpenseName" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String expenseName;

    @PositiveOrZero(message = "ExpectedAmount" + TablesAttributesValidationErrorMessages.NOT_NEGATIVE)
    private double expectedAmount;

    @PositiveOrZero(message = "ActualAmount" + TablesAttributesValidationErrorMessages.NOT_NEGATIVE)
    private double actualAmount;

    @ManyToOne(
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(name = "username")
    private User user;
}
