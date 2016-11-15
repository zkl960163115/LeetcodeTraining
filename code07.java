package com.zkl.code07;

/**
 * Created by ZKL on 2016/11/15  19:01
 */
public class code07 {
    public static void main(String[] args) {
//        System.out.println('1'-48);
        System.out.println(code07.reverse(153423669));
    }

    public static int reverse(int x) {
        boolean isNagetive = false;
        if(x>=0){
            isNagetive = true;
        }
        String numString = Integer.toString(x);
        int start = numString.length() - 1;
        int end = 0;
        if(!isNagetive){
            end++;
        }
        long result = 0;
        for (int i = start; i >=end ; i--) {
            result = result*10 + (numString.charAt(i)-'0');
        }
        if(isNagetive&&result> Integer.MAX_VALUE){
            return 0;
        }
        if(!isNagetive){
            result = -result;
            if(result<Integer.MIN_VALUE){
                return 0;
            }
        }
        return Integer.parseInt(Long.toString(result));
    }
}
