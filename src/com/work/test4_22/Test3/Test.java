package com.work.test4_22.Test3;

import java.util.*;

public class Test {
    /**
     * 第三题（集合）
     * <p>
     * 使用泛型 map 集合存储以下信息：
     * “主公”，    刘备，36 岁；
     * “大将军”，  赵子龙，28 岁；
     * “参军”，    魏延，25 岁；
     * “军师”，	孔明，26 岁；要求：
     * 1.创建英雄类 Hero，属性：姓名和年龄。使用封装，重写 toString()方法。
     * 2.使用增强 for 循环输出 map 集合中所有的职务。
     * 3.使用迭代器输出 map 集合中所有人物的姓名和年龄。
     * 4.循环遍历 map 集合中的每个元素，得到一个 Entry,然后拆开 entry，输出 key
     * 和 value。
     */
    public static void main(String[] args) {
        HashMap<String, Hero> map = new HashMap<>();
        map.put("主公", new Hero("刘备", 36));
        map.put("大将军", new Hero("赵子龙", 28));
        map.put("参军", new Hero("魏延", 25));
        map.put("军师", new Hero("孔明", 26));

        Set<String> positionSet = map.keySet();
        for (String position : positionSet) {
            System.out.println(position);
        }

        Collection<Hero> heros = map.values();
        Iterator<Hero> heroIterator = heros.iterator();
        while (heroIterator.hasNext()) {
            Hero hero = heroIterator.next();
            System.out.println("姓名:" + hero.getName() + "，年龄:" + hero.getAge());
        }

        for (Map.Entry<String, Hero> entry : map.entrySet()) {
            System.out.println("键:" + entry.getKey() + "，值:" + entry.getValue());
        }
    }
}

class Hero {
    private String name;
    private int age;

    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Hero() {
    }
}