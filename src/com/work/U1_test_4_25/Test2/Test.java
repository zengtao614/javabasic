package com.work.U1_test_4_25.Test2;

public class Test {
    /**
     * 第二题（循环）
     * 打印边长为6的空心菱形。
     */
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            //打印上三角
            for (int j = 0; j < 5 - i; j++) {
                //打印空格
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                //打印星
                if (j == 0 || j == 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //换行
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            //打印下三角
            for (int j = 0; j < i + 1; j++) {
                //打印空格
                System.out.print(" ");
            }
            for (int j = 0; j < 9 - 2 * i; j++) {
                //打印星
                if (j == 0 || j == 8 - 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //换行
            System.out.println();
        }

    }
}
