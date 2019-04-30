package com.supplementary_package;

import java.sql.Date;
import java.util.ArrayList;

public class Sup3 {
    /**
     * lambda表达式测试
     */
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(3);
//        list.add(2);
//        list.add(4);
//        list.add(6);
//        list.add(8);
//        int sum = ((Fun)lists->{
//            int sums = 0;
//            for (Integer i:lists){
//                sums+=i;
//            }
//            return sums;
//        }).sum(list);
//        System.out.println(sum);
        System.out.println(new Date(1970212044));
    }
}
interface Fun{
    int sum(ArrayList<Integer> list);
}
