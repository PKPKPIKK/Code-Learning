package com.LT.Learning.LV2.enumtest;

public class Enmutest2 {
    public static void main(String[] args) {
        orderState[] arr = orderState.values();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        orderState PAYMENT_PENDING = orderState.valueOf("PAYMENT_PENDING");
        System.out.println(PAYMENT_PENDING);
        System.out.println(PAYMENT_PENDING.getName());
    }
}
