package com.zkl.code03;

/**
 * Created by ZKL on 2016/11/19  20:17
 */
public class code03_2 {
    public static void main(String[] args) {
        System.out.println(code03_2.lengthOfLongestSubstring("dpawpsf"));
        System.out.println(code03_2.lengthOfLongestSubstring("d"));
    }
    public static int lengthOfLongestSubstring(String s) {
        int[] index = new int[128];
        int len = 0;
        int start = 0, end = 0;
        int length = s.length();
        for (; end < length; end++) {
            start = Math.max(start,index[s.charAt(end)]);
            len = Math.max(len,end-start+1);
            index[s.charAt(end)] = end+1;
        }
        return len;
    }
}
