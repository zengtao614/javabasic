package com.work;

import java.util.*;

/**
 * CreateDate:2019.4.16
 * word name:考前复习题.docx(src/File/考前复习题.docx)
 */
public class Test1 {
    static Util util = new Util();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void task1() {
        /**
         * 1、控制台提示用户输入一个字符串，过滤重复字符。效果如下：
         * 请输入一个字符串：abccbefagfdfefea
         * 过滤后的字符串是：abcefgd
         */
        String ip_str = scanner.next();

        /**
         * ip_str.split("")实现一个将该字符串分解为一个字符串数组；
         * Arrays.asList()方法实现将一个同类型的一组数据转换成一个List集合,
         * 此处是将该字符串数组转换成List集合.
         */
        List<String> list = Arrays.asList(ip_str.split(""));
        LinkedHashSet<String> hashSet = new LinkedHashSet<>(list);
        StringBuilder fil_str = new StringBuilder();
        for (String s : hashSet) {
            fil_str.append(s);
        }
        System.out.println(fil_str);

    }

    public static void task2() {
        /**
         * 2、控制台提示用户输入一个字符串，判断字符串左右两边是否对称。效果如下：
         * 请输入一个字符串：abclcba
         * abccba是对称字符串
         * 请输入一个字符串：abcdecba
         * abcdecba不是对称字符串
         */
        String ip_str = scanner.next();//abcba
        StringBuilder ip_strs = new StringBuilder(ip_str);
        if (ip_str.equals(ip_strs.reverse().toString())) {
            System.out.println("是");
        } else {
            System.out.println("不是");
        }
    }

    public static void task3() {
        /**
         * 3、使用面向对象实现以下功能：
         * 控制台提示用户输入一个年份。使用方法判断该年份是否为闰年。
         * 请输入年份：2016
         * 2009不是闰年
         */
        System.out.println("请输入年份:");
        boolean isLp = util.is_leap_year(scanner.nextInt());
        System.out.println(isLp ? "是闰年" : "不是闰年");
    }

    public static void task4() {
        /**
         * 4、定义一个方法判断用户输入的数字是否是水仙花数。
         * 提示："水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
         * 比如：153是一个"水仙花数"，因为153=1的三次方加上5的三次方加上3的三次方。
         */
        System.out.println("请输入一个三位数:");
        int ip_num = scanner.nextInt();
        if (ip_num >= 1000 || ip_num < 100) {
            System.out.println("你输入的不是一个三位数");
        } else {
            if (util.isDaffodil_number(ip_num)) {
                System.out.println("是水仙花数");
            } else {
                System.out.println("不是水仙花数");
            }
        }
    }

    public static void task5() {
        /**
         * 5、编写方法计算斐波拉契数列中前10个数字的和
         * 提示：斐波拉契数列形如：1,1,2,3,5,8,13,21,34,.......
         */
        System.out.println("请输入你要得到多少位的斐波拉契数列:");
        int num = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            list.add(util.Fibonacci_sequence(i));
        }
        System.out.println(list);
    }

    public static void task6() {
        /**
         *测试类:
         * 创建一个电动车对象,为电动车各项属性赋值,电动车电池有电,调用跑方法
         * 修改电池属性的值,使电动车电池没电,再次调用跑方法
         */
        Electric_bike eb = new Electric_bike(4, "黑色", true);
        eb.run();
        eb.setHas_electric(false);
        eb.run();
    }

    public static void task7() {
        /**
         *7、需求说明：使用StringBuffer类的length()和insert()方法实现
         * 将一个数字字符串转换成逗号分隔的数字串，即从右边开始每三个数字用逗号分隔，
         * 输出效果如图所示。
         */
        StringBuffer sb = new StringBuffer("1234567544889645600");
        for (int i = sb.length() - 3; i > 0; i -= 3) {
            sb.insert(i, ",");
        }
        System.out.println(sb);
    }

    public static void task8() {
        /**
         * 8、编程实现迷你计算器功能，
         * 支持“+”“-”“*”“/”，从控制台输入两个操作数，输出运算结果。
         */

    }

}

class Util {

    /**
     * 判断是否是闰年，第三题
     *
     * @param year 传入的年份
     * @return 返回一个布尔值，是true,不是false
     */
    public boolean is_leap_year(int year) {

        if (year % 4 == 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }

    /**
     * 判断输入三位数是否是水仙花数
     *
     * @param num 传入的三位数
     * @return 是则返回true, 不是返回false
     */
    public boolean isDaffodil_number(int num) {
        int hun_byte = num / 100;
        int ten_byte = num / 10 % 10;
        int one_byte = num % 10;
        if (hun_byte * hun_byte * hun_byte + ten_byte * ten_byte * ten_byte + one_byte * one_byte * one_byte == num) {
            return true;
        }
        return false;
    }

    /**
     * 得到斐波拉契数列
     *
     * @param index 传入的该数列的下标
     * @return 返回该下标对应的数
     */
    public int Fibonacci_sequence(int index) {
        if (index < 3) {
            return 1;
        } else {
            return Fibonacci_sequence(index - 1) + Fibonacci_sequence(index - 2);
        }
    }

}

class Bicyle {
    /**
     * 自行车类:
     * 属性:轮子个数,轮子颜色
     * 行为:跑(输出语句模拟:”瞪着跑”,输出语句中要有自行车的属性)
     */
    private int wheel_num;
    private String wheel_color;

    public Bicyle(int wheel_num, String wheel_color) {
        this.wheel_num = wheel_num;
        this.wheel_color = wheel_color;
    }

    public Bicyle() {
    }

    public void run() {
        System.out.println("蹬着" + wheel_num + "个轮子的" + wheel_color + "的车");
    }

    public int getWheel_num() {
        return wheel_num;
    }

    public void setWheel_num(int wheel_num) {
        this.wheel_num = wheel_num;
    }

    public String getWheel_color() {
        return wheel_color;
    }

    public void setWheel_color(String wheel_color) {
        this.wheel_color = wheel_color;
    }
}

class Electric_bike extends Bicyle {
    /**
     * 电动车类:
     * 属性:轮子个数,轮子颜色,电池(布尔类型:真代表有电,假代表没电)
     * 行为:跑(如果电池有电就骑着跑,如果电池没电只能瞪着跑)
     * 注意:骑着跑用输出语句模拟,瞪着跑需要调用自行车类的跑方法
     */
    private boolean has_electric;

    public Electric_bike(int wheel_num, String wheel_color, boolean has_electric) {
        super(wheel_num, wheel_color);
        this.has_electric = has_electric;
    }

    public Electric_bike() {
    }

    @Override
    public void run() {
        if (has_electric) {
            System.out.println("骑着" + getWheel_num() + "个轮子的" + getWheel_color() + "的车");
        } else {
            super.run();
        }
    }

    public boolean isHas_electric() {
        return has_electric;
    }

    public void setHas_electric(boolean has_electric) {
        this.has_electric = has_electric;
    }
}
