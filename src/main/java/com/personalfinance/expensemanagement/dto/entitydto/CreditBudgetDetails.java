package com.personalfinance.expensemanagement.dto.entitydto;

import com.personalfinance.expensemanagement.constants.MonthNames;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreditBudgetDetails {
    private String creditBudgetId;
    private MonthNames month;
    private String year;
    private String incomeName;
    private Double amount;
}
