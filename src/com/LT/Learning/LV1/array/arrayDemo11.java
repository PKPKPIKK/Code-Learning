package com.LT.Learning.LV1.array;

public class arrayDemo11 {
    public static void main(String[] args) {
        //数组的遍历,找到相同的数并输出 索引
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int[] target = {2,4,5,8,1,3,6,7,9,10};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < target.length; j++) {
                if(nums[i] == target[j]){
                    System.out.println("相同的数字为：" + nums[i] + "," + "索引为：" + i + "," + j);
//                    break;
                }
            }
        }
    }
}
