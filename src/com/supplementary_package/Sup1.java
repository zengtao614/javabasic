package com.supplementary_package;

import java.util.Arrays;
import java.util.Comparator;

public class Sup1 {
    /**
     * 补充类1,对象数组(列表)的排序
     * 1.让对象类实现Comparable接口
     * 2.新建Comparable接口子类匿名内部类并重写compareto方法
     */
    public static void main(String[] args) {
        Student stus[] = new Student[]{
                new Student("艾伦",1.78),
                new Student("阿尔明",1.70),
                new Student("贝尔罗特",1.88),
                new Student("利威尔",1.65),
                new Student("克丽丝塔",1.60)
        };
        Arrays.sort(stus, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getHeight()>o2.getHeight()){
                    return 1;
                }else if (o1.getHeight()<o2.getHeight()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(stus));
    }
}

class Student implements Comparable{
    private String name;
    private double height;
    public Student(String name,double height){
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "姓名:" + this.name + ",身高:" + this.height;
    }

    @Override
    public int compareTo(Object o) {
        if (this.height>((Student)o).height){
            return 1;
        }else if (this.height<((Student)o).height){
            return -1;
        }else {
            return 0;
        }
    }
}
