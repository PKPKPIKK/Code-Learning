package com.LT.Learning.LV1.practice;

import java.util.Random;

public class practiceDemo3 {
    public static void main(String[] args) {
        //生成五位随机验证码，前四位随机字母大小写，最后一位为数字
        Random r = new Random() ;
       char[] chs = new char[52];
        for (int i = 0; i < 26; i++) {
            chs[i] = (char)('a' + i);
            chs[i + 26] = (char)('A' + i);
        }
        for (int i = 0; i < 4; i++) {
            int num = r.nextInt(52);
            System.out.print(chs[num]);
        }
        System.out.print(r.nextInt(10) );
        System.out.println();

    }
}
