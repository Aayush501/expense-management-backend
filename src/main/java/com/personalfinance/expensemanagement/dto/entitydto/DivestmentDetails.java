package com.personalfinance.expensemanagement.dto.entitydto;

import com.personalfinance.expensemanagement.constants.DivestmentType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DivestmentDetails {
    private String divestmentId;
    private String investmentId;
    private DivestmentType divestmentType;
    private Double divestmentAmount;
}
