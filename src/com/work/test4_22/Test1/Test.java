package com.work.test4_22.Test1;

import java.util.Arrays;

public class Test {
    /**
     * 第一题（数组）
     * <p>
     * 使用冒泡排序实现长度为 10 的整型数组{19,56,25,3,45,78,100,1,0,9}的特定排序：
     * 1-5升序，6-10 降序。
     */
    public static void main(String[] args) {
        int arr[] = {19, 56, 25, 3, 45, 78, 100, 1, 0, 9};
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 5; i < arr.length; i++) {
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
