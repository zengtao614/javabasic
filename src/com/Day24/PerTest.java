package com.Day24;

import com.Day24.bean.Person;
import com.Day24.factory.StuFactory;
import com.Day24.factory.TeaFactory;

public class PerTest {
    public static void main(String[] args) {
        StuFactory stuFactory = new StuFactory();
        TeaFactory teaFactory = new TeaFactory();
        Person s = stuFactory.getPerson();
        Person t = teaFactory.getPerson();
        s.info();
        t.info();
    }
}
