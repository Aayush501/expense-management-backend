package com.personalfinance.expensemanagement.entities;

import com.personalfinance.expensemanagement.constants.TablesAttributesValidationErrorMessages;
import com.personalfinance.expensemanagement.constants.TransactionType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "transactions")
public class Transaction {
    @Id
    private String transactionId;

    @NotBlank(message = TablesAttributesValidationErrorMessages.IMPOSSIBLE_TO_ADD + "username")
    @Column(name = "username", insertable=false, updatable=false)
    private String username;

    @NotNull(message = "Date" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private LocalDate date;

    @NotBlank(message = "Description" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String description;

    @PositiveOrZero(message = "Amount" + TablesAttributesValidationErrorMessages.NOT_NEGATIVE)
    private double amount;

    @NotNull(message = "TransactionType" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    @NotBlank(message = "BankId" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    @Column(name = "bankId", insertable=false, updatable=false)
    private String bankId;

    @NotBlank(message = "WalletId" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    @Column(name = "walletId", insertable=false, updatable=false)
    private String walletId;

    @PositiveOrZero(message = "BankBalanceAfterThisTransaction" + TablesAttributesValidationErrorMessages.NOT_NEGATIVE)
    private double balanceAfterThisTransaction;

    @ManyToOne(
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(name = "username")
    private User user;

    @ManyToOne(
            fetch = FetchType.LAZY,
            optional = true
    )
    @JoinColumn(name = "bankId")
    private Bank bank;

    @ManyToOne(
            fetch = FetchType.LAZY,
            optional = true
    )
    @JoinColumn(name = "walletId")
    private Wallet wallet;

    @OneToOne(
            fetch = FetchType.EAGER,
            optional = true
    )
    @JoinColumn(name = "creditBudgetTransactionId")
    private CreditBudgetTransaction creditBudgetTransaction;

    @OneToOne(
            fetch = FetchType.EAGER,
            optional = true
    )
    @JoinColumn(name = "debitBudgetTransactionId")
    private DebitBudgetTransaction debitBudgetTransaction;

    @OneToOne(
            fetch = FetchType.EAGER,
            optional = true
    )
    @JoinColumn(name = "investmentInstallmentId")
    private InvestmentInstallment investmentInstallment;

    @OneToOne(
            fetch = FetchType.EAGER,
            optional = true
    )
    @JoinColumn(name = "divestmentId")
    private Divestment divestment;

    @OneToOne(
            fetch = FetchType.EAGER,
            optional = true
    )
    @JoinColumn(name = "debtTakingTransactionId")
    private DebtTakingTransaction debtTakingTransaction;

    @OneToOne(
            fetch = FetchType.EAGER,
            optional = true
    )
    @JoinColumn(name = "debtPayingTransactionId")
    private DebtTakingTransaction debtPayingTransaction;

    @OneToOne(
            fetch = FetchType.EAGER,
            optional = true
    )
    @JoinColumn(name = "receivablePayingTransactionId")
    private ReceivablePayingTransaction receivablePayingTransaction;

    @OneToOne(
            fetch = FetchType.EAGER,
            optional = true
    )
    @JoinColumn(name = "receivableReceivingTransactionId")
    private ReceivableReceivingTransaction receivableReceivingTransaction;
}
