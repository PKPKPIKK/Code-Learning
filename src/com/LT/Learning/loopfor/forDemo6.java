package com.LT.Learning.loopfor;

public class forDemo6 {
    public static void main(String[] args) {
        // 练习5
        int a = 0 ;
        int b = 1;
        int c = 0;
        for(int i = 3;i <=10; i++){
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println( c);
    }
}
