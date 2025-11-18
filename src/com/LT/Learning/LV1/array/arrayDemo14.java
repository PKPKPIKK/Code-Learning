package com.LT.Learning.LV1.array;

public class arrayDemo14 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        int count = 0;
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                System.out.println(i);
                flag = 1;
                break;
            }else if(nums[i] < target){
                count++;
            }
        }
        if(flag == 0){
            System.out.println(count);
        }
    }
}
