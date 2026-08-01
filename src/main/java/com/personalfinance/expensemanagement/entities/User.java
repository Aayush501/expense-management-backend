package com.personalfinance.expensemanagement.entities;

import com.personalfinance.expensemanagement.constants.StandardPatternsOfApplication;
import com.personalfinance.expensemanagement.constants.TablesAttributesValidationErrorMessages;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "users")
public class User {
    @Id
    @Pattern(regexp = StandardPatternsOfApplication.USERNAME,
            message = TablesAttributesValidationErrorMessages.USERNAME_VALIDATION_ERROR)
    private String username;

    @NotBlank(message = "FirstName" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String firstName;

    @NotBlank(message = "LastName" + TablesAttributesValidationErrorMessages.NOT_EMPTY)
    private String lastName;

    @Email(message = "Email" + TablesAttributesValidationErrorMessages.VALIDATION_ERROR)
    private String email;

    @Pattern(regexp = StandardPatternsOfApplication.PASSWORD,
            message = TablesAttributesValidationErrorMessages.PASSWORD_VALIDATION_ERROR)
    private String password;

    @Pattern(regexp = StandardPatternsOfApplication.PHONE,
            message = "Phone" + TablesAttributesValidationErrorMessages.VALIDATION_ERROR)
    private String phone;
}
