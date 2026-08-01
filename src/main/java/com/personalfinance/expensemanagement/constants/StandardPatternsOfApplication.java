package com.personalfinance.expensemanagement.constants;

public final class StandardPatternsOfApplication {
    public static final String USERNAME = "^[0-9a-zA-Z-]{6,12}$";
    public static final String PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,20}$";
    public static final String PHONE = "^[0-9]{10}$";
}
