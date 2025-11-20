package com.LT.Learning.LV1.method;

public class methodDemo1 {
    public static void main(String[] args) {
        int sum = Getsum(1,2);
        System.out.println(sum);
        System.out.println(Getsum(1,2));
    }
    /*
    * 注：1.方法和方法之间是平级关系
    * 2.方法不会主动运行，需要调用才可以
    * 3.小括号中的参数需要一一对应
    */
    public static  int Getsum(int a, int b){
        return a + b;
    }
}
