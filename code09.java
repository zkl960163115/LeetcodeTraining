package com.zkl.code09;

/**
 * Created by ZKL on 2016/11/15  20:30
 */
public class code09 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(code09.isPalindrome(-2147447412));
    }
    public static boolean isPalindrome(int x) {
        /*if(x==Integer.MIN_VALUE){
            return false;
        }*/
        if(x<0){
            //x=-x;
            return false;
        }
        long result = 0;
        int x1 = x;
        while (x>0){
            result = result*10 + x%10;
            x/=10;
            if(result>Integer.MAX_VALUE){
                return false;
            }
        }
        if(result!=x1){
            return false;
        }
        return true;
    }
}
