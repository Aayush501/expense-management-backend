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
@Table(name = "creditBudgetTransactions")
public class CreditBudgetTransaction {
    @Id
    private String creditBudgetTransactionId;

    @Column(name = "creditBudgetId", insertable=false, updatable=false)
    private String creditBudgetId;

    @ManyToOne(
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(name = "creditBudgetId")
    private CreditBudget creditBudget;
}
