package com.personalfinance.expensemanagement.entities;

import com.personalfinance.expensemanagement.constants.InvestmentType;
import com.personalfinance.expensemanagement.constants.TablesAttributesValidationErrorMessages;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
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
@Table(name = "investments")
public class Investment {
    @Id
    private String investmentId;

    @NotBlank(message = "InvestmentName" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String investmentName;

    @NotBlank(message = TablesAttributesValidationErrorMessages.IMPOSSIBLE_TO_ADD + "username")
    @Column(name = "username", insertable=false, updatable=false)
    private String username;

    @NotNull(message = "InvestmentType" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    @Enumerated(EnumType.STRING)
    private InvestmentType type;

    @PositiveOrZero(message = "Amount" + TablesAttributesValidationErrorMessages.NOT_NEGATIVE)
    private double installmentAmount;

    @Positive(message = "Cumulative" + TablesAttributesValidationErrorMessages.POSITIVE)
    @NotBlank(message = TablesAttributesValidationErrorMessages.IMPOSSIBLE_TO_ADD + "Cumulative")
    private long cumulative;

    @PositiveOrZero(message = "Payment" + TablesAttributesValidationErrorMessages.NOT_NEGATIVE)
    private double payment;

    @PositiveOrZero(message = "CurrentValue" + TablesAttributesValidationErrorMessages.NOT_NEGATIVE)
    private double currentValue;

    @ManyToOne(
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(name = "username")
    private User user;
}
