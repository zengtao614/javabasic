package com.work.U1_test_4_25.Test3;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, String color, int leg_num) {
        super(name, color, leg_num);
    }

    /**
     * 猫类：
     * * 属性：动物名字,毛的颜色,腿的个数
     * * 行为：猫吃鱼
     * * 猫特有行为：抓老鼠catchMouse
     */


    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {
        System.out.println(getColor() + "猫抓老鼠");
    }

}
