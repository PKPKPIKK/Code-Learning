package com.LT.Learning.LV1.method;

import java.util.Scanner;

public class methodDemo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight;
        while(true){
            System.out.println("请输入包裹重量：");
            weight = sc.nextInt();
            if(weight < 0){
                System.out.println("输入的包裹重量有误，请重新输入：");
            }else{
                break;
            }
        }
        double price = prices(weight);
        System.out.println("价格为：" + price);
    }
    public static double prices(int weight){
        double price;
        if(weight <= 1){
            price = 10;
        }else if(weight <= 5){
            price = 10 + (weight - 1) * 2;
        }else {
            price = 18 + (weight - 5) * 1.5;
        }
        return price;
    }

}
