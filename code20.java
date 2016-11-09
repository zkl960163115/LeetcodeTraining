package com.zkl.code20;

/**
 * Created by ZKL on 2016/11/8  19:32
 * 题意：匹配括号
 */
public class code20 {

    public static void main(String[] args){
        System.out.println(code20.isValid("(({)})"));
        System.out.println(code20.isValid("({()})"));
    }

    public static boolean isValid(String s) {

        //如果是奇数个则直接返回错误
        if (s.length()%2 == 1){
            return false;
        }

        //使用栈来保存左括号
        char[] stack = new char[100];
        int index = 0;

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            //遇到左括号则入栈
            if(c == '{' || c == '[' || c == '('){
                stack[index++] = c;
            }
            //遇到右括号则和栈顶元素进行匹配
            if(c == ')'){
                if(index == 0){
                    return false;
                }
                if(stack[index-1] == '('){
                    index--;
                }else {
                    return false;
                }
            }
            if(c == ']'){
                if(index == 0){
                    return false;
                }
                if(stack[index-1] == '['){
                    index--;
                }else {
                    return false;
                }
            }
            if(c == '}'){
                if(index == 0){
                    return false;
                }
                if(stack[index-1] == '{'){
                    index--;
                }else {
                    return false;
                }
            }
        }
        if(index != 0){
            return false;
        }

        return true;
    }
}
