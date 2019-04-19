package com.Day24.factory;

import com.Day24.bean.Animal;
import com.Day24.bean.Wolf;

public class WolfFactory implements Factory{
    @Override
    public Animal createAnimal() {
        return new Wolf();
    }
}
