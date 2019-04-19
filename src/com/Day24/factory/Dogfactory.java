package com.Day24.factory;

import com.Day24.bean.Animal;
import com.Day24.bean.Dog;

public class Dogfactory implements Factory
{
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
