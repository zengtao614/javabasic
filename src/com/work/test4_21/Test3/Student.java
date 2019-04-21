package com.work.test4_21.Test3;

public class Student extends Person {
    /**
     * 3.学生类:是人类的一种
     * 属性:
     * 含有和人相同的属性:姓名,年龄
     * 行为:
     * 学习方法(方法中打印:"18岁的小王在努力敲代码",
     * 注意:学习方法中打印的年龄和姓名需要获取,
     * 不能直接打印这句话:"18岁的小王在努力敲代码")
     */

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public void study() {
        System.out.println(getAge() + "的" + getName() + "在努力敲代码");
    }
}
