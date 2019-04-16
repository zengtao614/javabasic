package com.Day22;

public class RunableTest1 implements Runnable {

    /**
     * 练习3：模拟多人爬山
     * 1.需求说明：
     * (1)每个线程代表一个人
     * (2)可设置每人爬山速度
     * (3)每爬完100米显示信息
     * (4)爬到终点时给出相应提示
     */
    private int speed;
    private String name;
    private int length = 0;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public RunableTest1(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    public RunableTest1() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RunableTest1{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void run() {
        while (getLength() < 40) {
            try {
                Thread.sleep(1000);
                setLength(getLength()+getSpeed());
                System.out.println(Thread.currentThread().getName() + "爬了" + getLength() + "米");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

