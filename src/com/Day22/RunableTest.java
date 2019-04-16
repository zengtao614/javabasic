package com.Day22;

public class RunableTest implements Runnable {
    /**
     * 练习5：模拟叫号看病
     * 1.需求说明
     * (1)某科室一天需看普通号50个，特需号10个
     * (2)特需号看病时间是普通号的2倍
     * (3)开始时普通号和特需号并行叫号，叫到特需号的概率比普通号高
     * (4)当普通号叫完第10号时，要求先看完全部特需号，再看普通号
     * (5)使用多线程模拟这一过程
     */

    @Override
    public void run() {
        //子线程看特需号
        for (int i = 0; i < 10; i++) {
            System.out.println("正在叫" + Thread.currentThread().getName() + "第" + i + "号");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        //主线程看普通号
        RunableTest r1 = new RunableTest();
        Thread t1 = new Thread(r1, "特需号");
        t1.setPriority(8);
        t1.start();

        Thread.currentThread().setName("普通号");
        Thread.currentThread().setPriority(5);
        for (int i = 0; i < 50; i++) {
            System.out.println("正在叫" + Thread.currentThread().getName() + "第" + i + "号");
            Thread.sleep(1000);
            if (i == 10) {
                t1.join();
            }
        }
    }
}
