package com.Day22;


public class ThreadTest extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }

    public static void main(String[] args) throws Exception{
        ThreadTest t1 = new ThreadTest();
        t1.setName("子线程");
        t1.start();
//        t1.setPriority(10);

        Thread.currentThread().setName("主线程");
//        Thread.currentThread().setPriority(1);
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + i);
//            Thread.sleep(1000);
            if (i==200){
//                t1.join();
//                Thread.yield();
            }
        }

    }
}
