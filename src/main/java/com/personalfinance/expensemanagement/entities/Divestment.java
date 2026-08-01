package com.personalfinance.expensemanagement.entities;

import com.personalfinance.expensemanagement.constants.DivestmentType;
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
@Table(name = "divestment")
public class Divestment {
    @Id
    private String divestmentId;

    @NotBlank(message = TablesAttributesValidationErrorMessages.IMPOSSIBLE_TO_ADD + "investmentId")
    @Column(name = "investmentId", insertable=false, updatable=false)
    private String investmentId;

    @NotNull(message = "DivestmentType" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    @Enumerated(EnumType.STRING)
    private DivestmentType divestmentType;

    @PositiveOrZero(message = "DivestmentAmount" + TablesAttributesValidationErrorMessages.NOT_NEGATIVE)
    private double divestmentAmount;

    @ManyToOne(
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(name = "investmentId")
    private Investment investment;
}
