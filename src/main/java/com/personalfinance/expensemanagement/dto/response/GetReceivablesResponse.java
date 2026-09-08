package com.personalfinance.expensemanagement.dto.response;

import com.personalfinance.expensemanagement.dto.entitydto.ReceivableDetails;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetReceivablesResponse {
    private List<ReceivableDetails> receivables;
}
