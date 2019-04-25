package com.work.U1_test_4_25.Test5;

public class Person {
    /**
     * 懒汉式单例
     */
    private static Person person = new Person();

    private Person() {

    }

    public static Person getPerson() {
        return person;
    }
}
