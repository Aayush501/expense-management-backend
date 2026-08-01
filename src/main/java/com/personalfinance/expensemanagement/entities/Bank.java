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
@Table(name = "banks")
public class Bank {
    @Id
    private String bankId;

    @NotBlank(message = "bankName" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String bankName;

    @NotBlank(message = TablesAttributesValidationErrorMessages.IMPOSSIBLE_TO_ADD + "username")
    @Column(name = "username", insertable=false, updatable=false)
    private String username;

    @PositiveOrZero(message = "balance" + TablesAttributesValidationErrorMessages.NOT_NEGATIVE)
    private double balance;

    @ManyToOne(
        fetch = FetchType.LAZY,
        optional = false
    )
    @JoinColumn(name = "username")
    private User user;
}
