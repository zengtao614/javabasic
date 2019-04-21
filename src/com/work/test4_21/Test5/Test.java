package com.work.test4_21.Test5;

import java.util.*;

public class Test {
    /**
     * 5、集合
     * 需求说明：
     * 已知用户购买的商品名称如下:
     * 铅笔
     * 本子
     * 橡皮擦
     * 铅笔
     * 铅笔
     * 本子
     * 本子
     * 本子
     * <p>
     * a.请使用一个集合(使用泛型)存储用户购买的上述商品名称
     * b.利用迭代器方式遍历出上述集合
     * c.利用HashMap统计出每件商品对应的购买数量
     * d.利用增强for循环遍历上述的HashMap
     * 商品名称     数量
     * 铅笔          3
     * 本子          4
     * 橡皮擦        1
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("铅笔");
        list.add("本子");
        list.add("橡皮擦");
        list.add("铅笔");
        list.add("铅笔");
        list.add("本子");
        list.add("本子");
        list.add("本子");
        Iterator<String> iterator = list.iterator();
        HashMap<String, Integer> hashMap = new HashMap<>();
        while (iterator.hasNext()) {
            String itemName = iterator.next();
            System.out.println(itemName);
            if (hashMap.containsKey(itemName)) {
                hashMap.replace(itemName, Integer.valueOf(hashMap.get(itemName).intValue() + 1));
            } else {
                hashMap.put(itemName, 1);
            }
        }
        System.out.println(hashMap);
        for (Map.Entry o : hashMap.entrySet()) {
            System.out.println(o.getKey() + ":" + o.getValue());
        }
    }
}
