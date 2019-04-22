package com.work.test4_22.Test4;

public class Manager {

    public void pet(Animal animal) {
        animal.eat();
    }

    public Animal play(Animal a1, Animal a2) {
        if (a1.getForce() > a2.getForce()) {
            return a1;
        }
        return a2;
    }
}
