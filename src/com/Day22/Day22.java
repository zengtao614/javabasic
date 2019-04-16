package com.Day22;

import java.text.SimpleDateFormat;
import java.util.*;

public class Day22 {

    public static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws Exception {
        //第一题:日期计算
//        test1();
        //第二题：产生10个1-20之间的随机数存入集合, 要求随机数不能重复
//        test2();

        RunableTest1 r1 = new RunableTest1(5, "p1");
        RunableTest1 r2 = new RunableTest1(4, "p2");
        RunableTest1 r3 = new RunableTest1(3, "p3");
        RunableTest1 r4 = new RunableTest1(2, "p4");
        RunableTest1 r5 = new RunableTest1(1, "p5");
        new Thread(r1, r1.getName()).start();
        new Thread(r2, r2.getName()).start();
        new Thread(r3, r3.getName()).start();
        new Thread(r4, r4.getName()).start();
        new Thread(r5, r5.getName()).start();


    }

    private static void test2() {
        ArrayList<Integer> randomNum = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num;
            do {
                num = new Random().nextInt(20) + 1;
            }
            while (randomNum.contains(num));
            randomNum.add(num);
        }
        System.out.println(randomNum.size());
        System.out.println(randomNum);
    }


    private static void test1() throws Exception {
        /*键盘录入一个字符串”2018-2-14”, 将字符串转换为日期对象,
        再将日期对象转成日历对象,求2018年2月14日是星期几,
        以及是这一年的第几天,最后获取当前日期,将当前日期转换为字符串打印输出
        (如:今天是2018年09月13日),
        并计算2018年2月14日到当前日期隔了多少天.*/
        Scanner scanner = new Scanner(System.in);
        String timeStr = scanner.next();
        SimpleDateFormat sdf = new SimpleDateFormat("y-M-d");
        Date date = sdf.parse(timeStr);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println("星期" + (calendar.get(Calendar.DAY_OF_WEEK) - 1));
        System.out.println("今年的第" + calendar.get(Calendar.DAY_OF_YEAR) + "天");
        System.out.println("当前日期:" + sdf.format(new Date()));
        Date date1 = new Date();
        System.out.println((date1.getTime() - date.getTime()) / (1000 * 24 * 60 * 60));
    }
}
