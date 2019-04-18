package com.Day22;

/**
 * 生产者消费者模型
 * 线程的死锁问题
 */


class Info {
    private String name;
    private String content;
    private boolean flag = true;//true表示可生产不可取，false反之

    public synchronized void set(String name, String content) {
        if (!flag) {
            try {
                super.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(200);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.name = name;
        this.content = content;
        flag = false;
        super.notify();
    }

    public synchronized void get() {
        if (flag) {
            try {
                super.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(name + ":" + content);
        flag = true;
        super.notify();
    }
}

//消费者
class Cus implements Runnable {
    private Info info;

    public Cus(Info info) {
        this.info = info;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            info.get();
        }
    }
}

//生产者
class Pro implements Runnable {
    private Info info;

    public Pro(Info info) {
        this.info = info;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                info.set("二狗", "最靓的仔");
            } else {
                info.set("二哈", "最帅的狗");
            }
        }
    }
}
public class ThreadSync {
    static Info info = new Info();

    public static void main(String[] args) {
        new Thread(new Pro(info), "生产者").start();
        new Thread(new Cus(info), "消费者").start();
    }
}
