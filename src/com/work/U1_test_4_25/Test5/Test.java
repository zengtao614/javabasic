package com.work.U1_test_4_25.Test5;

public class Test {
    /**
     * 第五题 （单例模式）
     * 分别使用饿汉式和懒汉式实现Person类和User类的单例模式
     * 并创建测试类，测试程序中是否只有一个实体类对象。
     */
    public static void main(String[] args) {
        Person p1 = Person.getPerson();
        Person p2 = Person.getPerson();
        System.out.println(p1 == p2);
        User u1 = User.getUser();
        User u2 = User.getUser();
        System.out.println(u1 == u2);
    }
}
