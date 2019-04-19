package com.Day24;

public class Perpon {
    private static Perpon p = null;

    private Perpon (){

    }

    public static Perpon getP(){
        if (p==null)
            p = new Perpon();
        return p;
    }

}
