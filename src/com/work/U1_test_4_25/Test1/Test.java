package com.work.U1_test_4_25.Test1;

import java.util.Arrays;

public class Test {
    /**
     * 第一题（数组）
     * 使用冒泡排序实现长度为11的整型数组{19,56,25,3,45,78,100,1,0,9，5}的
     * 特定排序：1-6升序，7-11降序。
     */
    public static void main(String[] args) {
        int arr[] = new int[]{19, 56, 25, 3, 45, 78, 100, 1, 0, 9, 5};
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 6; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
