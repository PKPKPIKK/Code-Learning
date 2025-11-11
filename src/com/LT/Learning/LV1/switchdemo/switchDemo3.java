package com.LT.Learning.LV1.switchdemo;

import java.util.Scanner;

public class switchDemo3 {
    public static void main(String[] args) {
        //利用case穿透节省代码
        Scanner sc = new Scanner(System.in);
        // 根据月份输出季节
        System.out.println("请输入一个月份：");
        int month = sc.nextInt();
        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println("春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏天");
                break;
                case 9:
            case 10:
            case 11:
                System.out.println("秋天");
            break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬天");
                break;
            default:
                System.out.println("输入错误");
        }

        }
    }

