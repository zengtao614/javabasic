package com.work.test4_21.Test3;

public class Person {
    /**
     * 1.人类:
     * 属性:
     * 姓名,年龄
     * 行为:
     * 吃饭方法(方法中打印:人都要吃饭)
     */
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public void eat() {
        System.out.println("人都要吃饭");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
