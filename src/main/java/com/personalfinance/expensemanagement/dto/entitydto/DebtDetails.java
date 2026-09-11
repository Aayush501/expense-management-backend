package com.personalfinance.expensemanagement.dto.entitydto;

import com.personalfinance.expensemanagement.constants.DebtAndReceivableStatus;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DebtDetails {
    private String debtId;
    private Double amount;
    private String takenFrom;
    private LocalDate date;
    private String description;
    private DebtAndReceivableStatus status;
}
