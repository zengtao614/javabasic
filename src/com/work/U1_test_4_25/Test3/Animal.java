package com.work.U1_test_4_25.Test3;

public abstract class Animal {
    /**
     * 动物类:
     * * 属性:动物名字,毛颜色,腿个数；
     * * 行为:吃。
     */
    private String name;
    private String color;
    private int leg_num;

    public Animal(String name, String color, int leg_num) {
        this.name = name;
        this.color = color;
        this.leg_num = leg_num;
    }

    public abstract void eat();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", leg_num=" + leg_num +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLeg_num() {
        return leg_num;
    }

    public void setLeg_num(int leg_num) {
        this.leg_num = leg_num;
    }

    public Animal() {
    }
}
