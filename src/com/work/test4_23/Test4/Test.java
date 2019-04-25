package com.work.test4_23.Test4;

public class Test {
    /**
     * 4.终于，你穿越了回来，这时候你的技术已经被淘汰。你只能进入小公司实习学习，公司考虑到你是个渣，
     * 只分配给了你写枚举的任务。
     * 需求：创建一个学生类Student,里面有性别，年龄（15-18）,姓名以及成绩（优，良，差）
     * 其中，成绩，性别，年龄使用枚举来定义。
     * 测试：1.定义一个学生：隔壁老王，男，17，优。并输出他的信息
     *       2.定义一个女学生:隔壁老坤，男，17，优。并输出他的信息
     */
    public static void main(String[] args) {
        Student s1 = new Student("隔壁老王", Age.十七, Sex.男, Score.优);
        Student s2 = new Student("隔壁老坤", Age.十七, Sex.男, Score.优);
        System.out.println(s1);
        System.out.println(s2);
    }

}

class Student{
    private String name;
    private Age age;
    private Sex sex;
    private Score score;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public Student() {
    }

    public Student(String name, Age age, Sex sex, Score score) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.score = score;
    }
}

