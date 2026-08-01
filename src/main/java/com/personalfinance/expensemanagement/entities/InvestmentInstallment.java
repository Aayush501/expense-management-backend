package com.personalfinance.expensemanagement.entities;

import com.personalfinance.expensemanagement.constants.TablesAttributesValidationErrorMessages;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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
@Table(name = "investmentInstallment")
public class InvestmentInstallment {
    @Id
    private String investmentInstallmentId;

    @NotBlank(message = TablesAttributesValidationErrorMessages.IMPOSSIBLE_TO_ADD + "InvestmentId")
    @Column(name = "investmentId", insertable=false, updatable=false)
    private String investmentId;

    @Positive(message = "CumulativeCount" + TablesAttributesValidationErrorMessages.POSITIVE)
    private long cumulativeCount;

    @PositiveOrZero(message = "InstallmentAmount" + TablesAttributesValidationErrorMessages.NOT_NEGATIVE)
    private double installmentAmount;

    @ManyToOne(
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(name = "investmentId")
    private Investment investment;
}
