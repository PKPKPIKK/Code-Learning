package com.LT.Learning.LV1.loopwhile;

public class whileDemo3 {
    public static void main(String[] args) {
    double high = 8848860;
    double low = 0.1;
    int result = 0;
    while(high > low){
        low = low * 2;
        result++;
    }
        System.out.println("第" + result + "次，结果为：" + low);
        }
    }

