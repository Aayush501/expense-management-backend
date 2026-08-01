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
@Table(name = "debitBudgetTransactions")
public class DebitBudgetTransaction {
    @Id
    private String debitBudgetTransactionId;

    @Column(name = "debitBudgetId", insertable=false, updatable=false)
    private String debitBudgetId;

    @ManyToOne(
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(name = "debitBudgetId")
    private DebitBudget debitBudget;
}
