package com.personalfinance.expensemanagement.dto.entitydto;

import com.personalfinance.expensemanagement.constants.InvestmentType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InvestmentDetails {
    private String investmentId;
    private String investmentName;
    private InvestmentType type;
    private Double installmentAmount;
    private Long cumulative;
    private Double payment;
    private Double currentValue;
}
