package com.work.test4_23.Test1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    /**
     * 1.机试题
     * 1.创建一个tool工具类，里面拥有1个静态方法
     * （1）：如果用户输入的是时间，就将时间转换为字符串类型，并返回。如果用户输入的是字符串，
     * 就将字符串转换为时间类型，并返回。
     * 要求：使用泛型定义方法。而不是定义2个方法分别实现该功能。
     */
    public static void main(String[] args) {
        new Tool().fun("2019-04-23");
    }
}
class Tool{
    public <T> void fun(T t){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if (t instanceof String){
            try {
                Date date = sdf.parse((String) t);
                System.out.println(date);
            }catch (Exception e){
                e.printStackTrace();
            }
        }else if (t instanceof Date){
            String str = sdf.format((Date)t);
            System.out.println(str);
        }
    }
}