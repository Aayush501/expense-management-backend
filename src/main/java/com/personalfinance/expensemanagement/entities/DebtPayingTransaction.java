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
@Table(name = "DebtPayingTransactions")
public class DebtPayingTransaction {
    @Id
    private String debtPayingTransactionId;

    @Column(name = "debtId", insertable=false, updatable=false)
    private String debtId;

    @ManyToOne(
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(name = "debtId")
    private Debt debt;
}
