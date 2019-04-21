package com.Day24;

public class SOTest {
    private static SOTest st = new SOTest();
    private SOTest(){

    }
    public static SOTest getInstance(){
        return st;
    }

    public static void main(String[] args) {
        SOTest s1 = SOTest.getInstance();
        SOTest s2 = SOTest.getInstance();
        System.out.println(s1==s2);
    }
}
