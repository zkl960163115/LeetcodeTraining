package com.zkl.code01;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ZKL on 2016/11/14  17:39
 */
public class code01 {
    public static void main(String[] args){
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = code01.twoSum(nums,target);
        System.out.println(result[0]+","+result[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> numMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i],i);
        }
        for (int i = 0; i < nums.length-1; i++) {
            int other = target - nums[i];
            if(numMap.containsKey(other)){
                result[0] = i;
                result[1] = numMap.get(other);
                if(result[0] != result[1]){
                    return result;
                }
            }
        }
        return result;
    }
}
