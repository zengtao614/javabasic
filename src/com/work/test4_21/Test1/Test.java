package com.work.test4_21.Test1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    /**
     * 一．List集合
     * 使用ArrayList集合，对其添加100个不同的元素：
     * 1.使用add()方法将元素添加到ArrayList集合对象中；
     * 2.调用集合的iterator()方法获得Iterator对象，
     * 并调用Iterator的hasNext()和next()方法，迭代的读取集合中的每个元素；
     * 3.调用get()方法先后读取索引位置为50和102的元素，
     * 要求使用try-catch结构处理下标越界异常；
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        try {
            System.out.println(list.get(50));
            System.out.println(list.get(102));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
