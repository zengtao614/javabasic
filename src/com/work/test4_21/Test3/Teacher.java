package com.work.test4_21.Test3;

public class Teacher extends Person {

    /**
     * 2.老师类:是人类的一种
     * 属性:
     * 含有和人相同的属性:姓名,年龄
     * 行为:
     * 教课方法(方法中打印:"33岁的老王在教java",
     * 注意:教课方法中打印的年龄和姓名需要获取,
     * 不能直接打印这句话:"33岁的老王在教java")
     */

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher() {
    }

    public void teach() {
        System.out.println(getAge() + "的" + getName() + "在教java");
    }
}
