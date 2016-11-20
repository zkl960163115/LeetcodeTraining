package com.zkl.code03;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ZKL on 2016/11/16  14:54
 */
public class code03 {
    public static void main(String[] args) {
        System.out.println(code03.lengthOfLongestSubstring(""));
        System.out.println(code03.lengthOfLongestSubstring("aab"));
        System.out.println(code03.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(code03.lengthOfLongestSubstring("bbbbb"));
        System.out.println(code03.lengthOfLongestSubstring("pawkwpewscdf"));
        System.out.println(code03.lengthOfLongestSubstring("pawkwp"));
        System.out.println(code03.lengthOfLongestSubstring("a"));
        System.out.println(code03.lengthOfLongestSubstring("ohomm"));
        System.out.println(code03.lengthOfLongestSubstring("tmmzuxt"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if(s.equals("")){
            return 0;
        }
        Map<Character,Integer> strMap = new HashMap<Character, Integer>();
        int start = 0;
        int len = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if(strMap.containsKey(c)){
                int temp = strMap.get(c);
                if(start<=temp){
                    len = len>(i-start)?len:(i-start);
                    start = temp+1;
                }
            }
            strMap.put(c,i);
        }
        len = len>(length-start)?len:(length-start);
        return len;
    }
}
