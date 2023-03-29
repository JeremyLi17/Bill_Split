package com.easypay.security;

/**
 * @author jeremy on 2023/1/25
 */
public class SecurityConst {
    public static final long EXPIRATION_TIME = 432_000_000; // 5 days in milliseconds
    public static final String TOKEN_PREFIX = "Bearer ";    // means this token is valid
    public static final String JWT_TOKEN_HEADER = "Jwt-Token";
    public static final String TOKEN_CANNOT_BE_VERIFIED = "Token cannot be verified";
    public static final String ISSUER = "EASY_PAY";
    public static final String ADMINISTRATION = "EASY_PAY";
    public static final String AUTHORITIES = "Authorities";
    public static final String FORBIDDEN_MESSAGE = "You need to log in to access this page";
    public static final String ACCESS_DENIED_MESSAGE = "You don not have permission to access this page";
    public static final String OPTIONS_HTTP_METHOD = "OPTIONS";
    public static final String[] PUBLIC_URLS = {
            "/user/login",
            "/user/register",
            "/user/resetpassword/**"
    };
}
