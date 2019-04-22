package com.work.test4_22.Test4;

public class Test {
    /**
     * 第四题（面向对象）
     * <p>
     * 创建动物类 Animal,属性:名称，体重 weight，战斗力 force；方法：进食 eat();
     * 子类有：大象 Elephant ,狮子 Lion
     * 要求：
     * 1.父类作为抽象类，子类继承父类，并重写抽象方法：大象开心地吃水果， 狮子开心地吃肉
     * 2.创建驯养员类，两个方法：
     * (1)给动物喂食
     * (2)让动物表演：比较两个动物的战斗力，返回获胜的动物。
     * 3.现有一头大象胖胖，体重 100，战斗力 80；一头狮子酷酷，体重 70，战斗力 60
     * 4.编写测试类，实现
     * (1)驯养员给狮子喂食
     * (2)驯养员让狮子和大象表演，输出获胜的动物名称。
     */
    public static void main(String[] args) {
        Manager m = new Manager();
        Elephant e = new Elephant("胖胖", 100, 80);
        Lion l = new Lion("酷酷", 70, 60);
        m.pet(l);
        Animal winAnimal = m.play(e, l);
        System.out.println(winAnimal);
    }
}