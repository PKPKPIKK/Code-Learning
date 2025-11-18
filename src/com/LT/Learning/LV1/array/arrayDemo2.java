package com.LT.Learning.LV1.array;

import java.net.SocketTimeoutException;

public class arrayDemo2 {
    public static void main(String[] args) {
        //数字的获取和修改
        //一但修改完毕，原来的数据就没有了
        int[] arr = {11,12,13,14,15};
        System.out.println(arr[0]);
        int num = arr[1];
        System.out.println(num);
        arr[4] = 100;
        System.out.println(arr[4]);
    }
}
