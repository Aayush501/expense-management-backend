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
@Table(name = "receivablesReceivingTransactions")
public class ReceivableReceivingTransaction {
    @Id
    private String receivableReceivingTransactionId;

    @Column(name = "receivableId", insertable=false, updatable=false)
    private String receivableId;

    @ManyToOne(
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(name = "receivableId")
    private Receivable receivable;
}
