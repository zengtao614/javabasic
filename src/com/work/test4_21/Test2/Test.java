package com.work.test4_21.Test2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    /**
     * 二．日期
     * 编写一个工具类DateUtil,该类有两个方法，分别实现如下功能：(5分)
     * 1）用来实现字符串转换成Date
     * 2）Date转换成字符串。
     * 要求：面向对象方式实现，其他方式不得分
     * 实现日期格式的字符串转换为java.util.Date类型。
     * 例如：“2017-10-20”转换为日期格式；
     * 实现java.util.Date类型的值转换为字符串格式；
     */
    public static void main(String[] args) {
        DateUtil du = new DateUtil();
        System.out.println(du.dateTostr(new Date(), "yyyy-MM-dd"));
        System.out.println(du.strTodate("2019-10-1", "yyyy-MM-dd"));
    }
}

class DateUtil {

    /**
     * 用来实现字符串转换成Date
     *
     * @param str     传入的字符串对象
     * @param pattern 传入的解析格式
     * @return 返回该Date对象
     */
    public Date strTodate(String str, String pattern) {
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        try {
            date = sdf.parse(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * Date转换成字符串。
     *
     * @param date    传入的Date对象
     * @param pattern 传入的解析格式
     * @return 返回转换后的字符串对象
     */
    public String dateTostr(Date date, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String str = sdf.format(date);
        return str;
    }
}