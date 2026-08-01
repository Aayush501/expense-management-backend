package com.personalfinance.expensemanagement.entities;

import com.personalfinance.expensemanagement.constants.TablesAttributesValidationErrorMessages;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "wallets")
public class Wallet {
    @Id
    private String walletId;

    @NotBlank(message = "WalletName" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String walletName;

    @NotBlank(message = TablesAttributesValidationErrorMessages.IMPOSSIBLE_TO_ADD + "username")
    @Column(name = "username", insertable=false, updatable=false)
    private String username;

    @PositiveOrZero(message = "Balance" + TablesAttributesValidationErrorMessages.NOT_NEGATIVE)
    private double balance;

    @ManyToOne(
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(name = "username")
    private User user;
}
