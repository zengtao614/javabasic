package com.Day24;

public class Day24 extends Thread {
    private static Perpon p = null;

    public static void main(String[] args) throws Exception{
        /*Dogfactory dogfactory = new Dogfactory();
        Animal dog = dogfactory.createAnimal();
        dog.eat();
        WolfFactory wolfFactory = new WolfFactory();
        Animal wolf = wolfFactory.createAnimal();
        wolf.eat();*/

        /*new Thread().start();
        Perpon pp = Perpon.getP();
        System.out.println(pp == p);*/
        Runtime run = Runtime.getRuntime();
        run.exec("notepad");

    }

    @Override
    public void run() {
        p = Perpon.getP();
    }
}
