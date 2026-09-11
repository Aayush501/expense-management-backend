package com.personalfinance.expensemanagement.dto.entitydto;

import com.personalfinance.expensemanagement.constants.MonthNames;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DebitBudgetDetails {
    private String debitBudgetId;
    private MonthNames month;
    private String year;
    private String expenseName;
    private Double expectedAmount;
    private Double actualAmount;
}
