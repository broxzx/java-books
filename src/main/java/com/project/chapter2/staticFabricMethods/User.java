package com.project.chapter2.staticFabricMethods;

import lombok.Data;

import java.math.BigInteger;

/*
    consider using static fabric methods instead of constructors
*/

@Data
public class User {

    private String username;
    private String password;
    private String email;
    private BigInteger balance;

    public static User createUserWithoutEmail(String username, String password) {
        User user = new User();
        user.username = username;
        user.password = password;


        return user;
    }

    public static User createUserWithEmail(String username, String password, String email) {
        User user = createUserWithoutEmail(username, password);
        user.email = email;

        return user;
    }

}
