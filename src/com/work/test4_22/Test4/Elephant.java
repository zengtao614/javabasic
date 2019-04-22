package com.work.test4_22.Test4;

public class Elephant extends Animal {
    public Elephant() {
    }

    public Elephant(String name, double weight, double force) {
        super(name, weight, force);
    }

    @Override
    public void eat() {
        System.out.println("大象开心的吃水果");
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "name:" + getName() +
                ",weight:" + getWeight() +
                ",force:" + getForce() +
                "}";
    }
}
