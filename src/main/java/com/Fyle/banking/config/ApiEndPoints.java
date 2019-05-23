package com.Fyle.banking.config;

public class ApiEndPoints {
    private static final String API_PATH = "/api/v1";

    public static final String BANK_DETAILS_BY_IFSC = API_PATH + "/bank/{ifsc}";
    public static final String BRANCHES_BY_NAME_AND_CITY = API_PATH +"/branch/{name}/{city}";
}
