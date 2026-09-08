package com.personalfinance.expensemanagement.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CoreAccountDetailUpdateRequest {
    private String username;
    private String password;
    private String systemIdentity;
    private String token;
}
