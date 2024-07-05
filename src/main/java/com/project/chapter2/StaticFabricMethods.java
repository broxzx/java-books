package com.project.chapter2;

import lombok.Data;

import java.math.BigInteger;

/*
    consider using static fabric methods instead of constructors
*/

@Data
public class StaticFabricMethods {

    private String username;
    private String password;
    private String email;
    private BigInteger balance;

    public static StaticFabricMethods createUserWithoutEmail(String username, String password) {
        StaticFabricMethods staticFabricMethods = new StaticFabricMethods();
        staticFabricMethods.username = username;
        staticFabricMethods.password = password;


        return staticFabricMethods;
    }

    public static StaticFabricMethods createUserWithEmail(String username, String password, String email) {
        StaticFabricMethods staticFabricMethods = createUserWithoutEmail(username, password);
        staticFabricMethods.email = email;

        return staticFabricMethods;
    }

}
