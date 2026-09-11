package com.personalfinance.expensemanagement.dto.entitydto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InvestmentInstallmentDetails {
    private String investmentInstallmentId;
    private String investmentId;
    private Long cumulativeCount;
    private Double installmentAmount;
}
