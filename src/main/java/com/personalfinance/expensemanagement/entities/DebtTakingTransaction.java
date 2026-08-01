package com.personalfinance.expensemanagement.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "DebtTakingTransactions")
public class DebtTakingTransaction {
    @Id
    private String DebtTakingTransactionId;

    @Column(name = "debtId", insertable=false, updatable=false)
    private String debtId;

    @ManyToOne(
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(name = "debtId")
    private Debt debt;
}
