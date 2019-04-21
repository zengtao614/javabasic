package com.Day24.factory;

import com.Day24.bean.Person;
import com.Day24.bean.Student;

public class StuFactory implements PersonFactory{
    @Override
    public Person getPerson() {
        return new Student();
    }
}
