package com.zkl.code26;

/**
 * Created by ZKL on 2016/11/9  14:11
 */
public class code26 {

    public static void main(String[] args){
        int[] nums = { 1 , 1 , 2 , 2 , 4 , 5 , 5 ,7};
        System.out.println(code26.removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0){
            return 0;
        }
        int count = 1;
        int nums_index = nums[0];
        for ( int i = 1; i < nums.length; i++){
            if(nums[i] == nums_index){
                continue;
            }else {
                count++;
                nums_index = nums[i];
                nums[count-1] = nums_index;
            }
        }
        return count;
    }

}
