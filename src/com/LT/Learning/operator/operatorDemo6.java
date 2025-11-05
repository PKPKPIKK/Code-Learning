package com.LT.Learning.operator;

import java.util.Scanner;

public class operatorDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入大写字母，转换为小写字母
        char ch = sc.next().charAt(0);
        //转为小写字母，ASCII码相差32
        char ch1 = (char)(ch + 32);
        System.out.println(ch1);

    }
}
