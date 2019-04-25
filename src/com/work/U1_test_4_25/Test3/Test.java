package com.work.U1_test_4_25.Test3;

public class Test {
    /**
     * 第三题（面向对象）
     * 动物类:
     * 属性:动物名字,毛颜色,腿个数；
     * 行为:吃。
     * 猫类：
     * 属性：动物名字,毛的颜色,腿的个数
     * 行为：猫吃鱼
     * 猫特有行为：抓老鼠catchMouse
     * 狗类
     * 属性: 动物名字,毛的颜色,腿的个数
     * 行为:狗啃骨头
     * 狗特有行为：看家lookHome
     * 测试类
     * 用多态的形式,调用猫和狗的共同行为
     * 利用向下转型调用猫和狗的特有行为
     * 打印结果:
     */
    public static void main(String[] args) {
        Animal dog = new Dog("小黑", "黑色", 4);
        Animal cat = new Cat("小白", "白色", 4);
        dog.eat();
        ((Dog) dog).lookHome();
        cat.eat();
        ((Cat) cat).catchMouse();
    }
}
