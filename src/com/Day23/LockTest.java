package com.Day23;

public class LockTest implements Runnable {
    @Override
    public synchronized void run() {
        for (int i = 0; i < 100; i += 10) {
            try {
                Thread.sleep(1000);
                System.out.println("选手" + Thread.currentThread().getName() + "跑了" + i + "米");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        LockTest lockTest = new LockTest();
        for (int i = 0; i < 10; i++) {
            new Thread(lockTest, "第" + i + "位选手").start();
        }
    }
}
