package com.zkl.code14;

/**
 * Created by ZKL on 2016/11/15  21:28
 */
public class code14 {
    public static void main(String[] args) {
        String[] strs = {"abcde","abcd","abc","abcf"};
        //System.out.println(s.substring(0, 1));
        System.out.println(code14.longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int strsLength = strs.length;
        if (strsLength == 1) {
            return strs[0];
        }
        int end = 0;
        int len1 = strs[0].length();
        int len2 = strs[1].length();
        while (end < len1 && end < len2) {
            if (strs[0].charAt(end) != strs[1].charAt(end)) {
                break;
            }
            end++;
        }
        if (end == 0) {
            return "";
        }
        for (int i = 1; i < strsLength - 1; i++) {
            if(end>strs[i+1].length()){
                end=strs[i+1].length();
            }
            while (end > 0) {
                if (strs[i].substring(0, end).equals(strs[i+1].substring(0, end))) {
                    break;
                }
                end--;
            }
            if(end==0){
                return "";
            }
        }
        return strs[0].substring(0,end);
    }
}
