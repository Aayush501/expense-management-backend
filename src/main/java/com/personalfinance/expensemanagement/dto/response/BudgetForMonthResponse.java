package com.personalfinance.expensemanagement.dto.response;

import com.personalfinance.expensemanagement.constants.MonthNames;
import com.personalfinance.expensemanagement.dto.entitydto.CreditBudgetDetails;
import com.personalfinance.expensemanagement.dto.entitydto.DebitBudgetDetails;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BudgetForMonthResponse {
    private MonthNames month;
    private String year;
    private List<CreditBudgetDetails> incomes;
    private List<DebitBudgetDetails> expectedExpenses;
}
