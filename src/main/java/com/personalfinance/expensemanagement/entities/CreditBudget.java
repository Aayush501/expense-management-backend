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
@Table(name = "creditBudget")
public class CreditBudget {
    @Id
    private String creditBudgetId;

    @NotBlank(message = TablesAttributesValidationErrorMessages.IMPOSSIBLE_TO_ADD + "username")
    @Column(name = "username", insertable=false, updatable=false)
    private String username;

    @NotNull(message = "Month" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    @Enumerated(EnumType.STRING)
    private MonthNames month;

    @NotBlank(message = "Year" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String year;

    @NotBlank(message = "IncomeName" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String incomeName;

    @PositiveOrZero(message = "Amount" + TablesAttributesValidationErrorMessages.NOT_NEGATIVE)
    private double amount;

    @ManyToOne(
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(name = "username")
    private User user;
}
