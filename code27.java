package com.zkl.code27;

/**
 * Created by ZKL on 2016/11/9  15:16
 */
public class code27 {

    public static void main(String[] args){
        int[] nums = {3 , 2 , 2 , 3 , 3 , 1 , 5 , 4 , 3};
        System.out.println(code27.removeElement(nums,3));
        System.out.println();
        for (int bottom = 0; bottom < nums.length; bottom++){
            System.out.println(nums[bottom]);
        }
    }

    public static int removeElement(int[] nums, int val) {
        int top = 0;
        int bottom = 0;
        for (; bottom < nums.length; bottom++){
            if(nums[bottom] == val){
                continue;
            }else {
                nums[top++] = nums[bottom];
            }
        }
        return top;
    }

}
