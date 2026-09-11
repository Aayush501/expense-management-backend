package com.personalfinance.expensemanagement.dto.entitydto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankDetails {
    private String bankId;
    private String bankName;
    private double balance;
}
