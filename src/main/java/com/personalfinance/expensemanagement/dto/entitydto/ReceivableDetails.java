package com.personalfinance.expensemanagement.dto.entitydto;

import com.personalfinance.expensemanagement.constants.DebtAndReceivableStatus;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReceivableDetails {
    private String receivableId;
    private String givenTo;
    private Double amount;
    private LocalDate date;
    private String description;
    private DebtAndReceivableStatus status;
}
