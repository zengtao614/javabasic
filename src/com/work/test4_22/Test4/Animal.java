package com.work.test4_22.Test4;

public abstract class Animal {
    /**
     * 创建动物类 Animal,属性:名称，体重 weight，战斗力 force；方法：进食 eat();
     */

    private String name;
    private double weight;
    private double force;

    public abstract void eat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getForce() {
        return force;
    }

    public void setForce(double force) {
        this.force = force;
    }

    public Animal() {
    }

    public Animal(String name, double weight, double force) {
        this.name = name;
        this.weight = weight;
        this.force = force;
    }
}
