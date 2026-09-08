package com.personalfinance.expensemanagement.dto.response;

import com.personalfinance.expensemanagement.dto.entitydto.UserDetails;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailsResponse {
    private UserDetails user;
}
