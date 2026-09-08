package com.personalfinance.expensemanagement.dto.response;

import com.personalfinance.expensemanagement.dto.entitydto.DivestmentDetails;
import com.personalfinance.expensemanagement.dto.entitydto.InvestmentInstallmentDetails;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InvestmentLedgerResponse {
    private List<InvestmentInstallmentDetails> installments;
    private List<DivestmentDetails> divestmentDetails;
}
