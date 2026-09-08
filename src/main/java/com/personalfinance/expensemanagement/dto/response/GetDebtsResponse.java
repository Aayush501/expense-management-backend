package com.personalfinance.expensemanagement.dto.response;

import com.personalfinance.expensemanagement.dto.entitydto.DebtDetails;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetDebtsResponse {
    private List<DebtDetails> debts;
}
