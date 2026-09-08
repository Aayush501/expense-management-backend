package com.personalfinance.expensemanagement.dto.response;

import com.personalfinance.expensemanagement.dto.entitydto.BankDetails;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BanksListResponse {
    private List<BankDetails> banks;
}
