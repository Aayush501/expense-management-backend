package com.personalfinance.expensemanagement.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SystemIdentityProvidingResponse {
    private String username;
    private String systemIdentity;
    private String initialToken;
}
