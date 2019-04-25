package com.work.U1_test_4_25.Test3;

public class Dog extends Animal {
    /**
     * 狗类
     * * 属性: 动物名字,毛的颜色,腿的个数
     * * 行为:狗啃骨头
     * * 狗特有行为：看家lookHome
     */


    public Dog() {
    }

    public Dog(String name, String color, int leg_num) {
        super(name, color, leg_num);
    }

    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    public void lookHome() {
        System.out.println(getColor() + "狗看家");
    }
}
