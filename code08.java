package com.zkl.code08;

/**
 * Created by ZKL on 2016/11/15  19:30
 *      神烦！！！
 */
public class code08 {
    public static void main(String[] args) {
//        System.out.println(Integer.MIN_VALUE);
        System.out.println(code08.myAtoi(""));
    }
    public static int myAtoi(String str) {
        if(str == null || str.equals("")){
            return 0;
        }
        int end = str.length();
        boolean isNagetive = false;
        long result = 0;
        int start = 0;
        while (str.charAt(start)==' '){
            start++;
        }
        if(str.charAt(start)=='-'){
            if(end == (start+1)){
                return 0;
            }
            start++;
            isNagetive = true;
        }else if(str.charAt(start)=='+'){
            if(end == (start+1)){
                return 0;
            }
            start++;
        }

        for (int i = start; i < end ; i++) {
            char c = str.charAt(i);
            if(c<'0'||c>'9'){
                break;
            }
            result = result*10 + c - '0';
            if(result>Integer.MAX_VALUE){
                break;
            }
        }
        if(isNagetive){
            result = -result;
        }
        if(result<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        if(result>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        return (int)result;
    }
}
