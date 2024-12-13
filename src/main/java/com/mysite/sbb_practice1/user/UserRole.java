package com.mysite.sbb_practice1.user;

import lombok.Getter;

@Getter
public enum UserRole {

    ADMIN("ROlE_ADMIN"),
    USER("ROLE_USER");

    UserRole(String value) {
        this.value = value;
    }

    private final String value;

}