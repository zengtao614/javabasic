package com.work.test4_23.Test5;

import java.util.Random;

public class Test {
    /**
     * 5.最后，你看破红尘，决定放弃it行业回家卖水果。但是同行们都是用的电子系统来收账记账，作为it行业的精英怎么可以花钱买系统！你准备自己编写一套计算水果利润的系统。
     * 需求：1.定义一个水果fruit类，其中拥有保质期(Date),利润(money),名称(name)三个属性。
     * 你的水果店有3种水果：
     * 1.草莓 7天保质期  30(每斤)
     * 2.菠萝 5天保质期   15(每斤)
     * 3.葡萄 3天保质期   20(每斤)
     * <p>
     * 问题:你今天去进货，总共买入了150斤草莓，100斤菠萝以及90斤葡萄。
     * 你每日可售出10-20斤草莓，15-20斤菠萝，20-30斤葡萄。
     * 请编写程序模拟出一周的销售利润以及损耗。
     */
    static Fruit fruits[] = new Fruit[]{
            new Fruit("草莓", 7, 30, 150, 10, 20),
            new Fruit("菠萝", 5, 15, 100, 15, 20),
            new Fruit("葡萄", 3, 20, 90, 20, 30)
    };
    static double profits[] = new double[fruits.length];

    public static void main(String[] args) {
        getmoney();
    }

    private static void getmoney() {

        for (int day = 0; day < 7; day++) {
            for (int i = 0; i < fruits.length; i++) {
                if (day < fruits[i].getDate() && fruits[i].getCount() > 0) {
                    int daySell = fruits[i].daySell();
                    System.out.print(fruits[i].getName() + "第" + day + "天卖出了" + daySell + "\t");
                    if (fruits[i].getCount() - daySell > 0) {
                        profits[i] += fruits[i].getMoney() * daySell;
                    } else {
                        profits[i] += fruits[i].getMoney() * fruits[i].getCount();
                    }
                    fruits[i].setCount(fruits[i].getCount() - daySell > 0 ? fruits[i].getCount() - daySell : 0);
                }
            }
            System.out.println();
        }

        System.out.println("f1的利润是" + profits[0] + ",f2的利润是" + profits[1] + "，f3的利润是" + profits[2]);
        System.out.println("f1的损耗是" + fruits[0].getCount() + ",f2的损耗是" + fruits[1].getCount() + "，f3的损耗是" + fruits[2].getCount());
    }
}

class Fruit {
    private int date;
    private double money;
    private String name;
    private int count;
    private int upper;
    private int lower;

    public Fruit(String name, int date, double money, int count, int lower, int upper) {
        this.date = date;
        this.money = money;
        this.name = name;
        this.count = count;
        this.upper = upper;
        this.lower = lower;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUpper() {
        return upper;
    }

    public void setUpper(int upper) {
        this.upper = upper;
    }

    public int getLower() {
        return lower;
    }

    public void setLower(int lower) {
        this.lower = lower;
    }

    public int daySell() {
        int random_daySell = new Random().nextInt(upper - lower) + lower;
        return random_daySell;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fruit() {
    }
}
