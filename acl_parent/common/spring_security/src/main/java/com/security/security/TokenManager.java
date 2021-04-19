package com.security.security;

import org.springframework.stereotype.Component;

@Component
public class TokenManager {

    private long tokenEcpiration = 24 * 60 * 60 * 1000;

    private String tokenSignKey = "123456";


}
