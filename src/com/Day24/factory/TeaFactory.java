package com.Day24.factory;

import com.Day24.bean.Person;
import com.Day24.bean.Teacher;

public class TeaFactory implements PersonFactory{
    @Override
    public Person getPerson() {
        return new Teacher();
    }
}
