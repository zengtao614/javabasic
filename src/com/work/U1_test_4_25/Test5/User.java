package com.work.U1_test_4_25.Test5;

public class User {
    /**
     * 饿汉式
     */
    private static User user = null;

    private User() {

    }

    public static User getUser() {
        if (user == null) {
            user = new User();
        }
        return user;
    }
}
