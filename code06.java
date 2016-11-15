package com.zkl.code06;

/**
 * Created by ZKL on 2016/11/15  14:06
 */
public class code06 {

    public String convert(String s, int numRows) {
        StringBuilder str = new StringBuilder("");
        int length = s.length();
        int depth = 2 * numRows - 2;

        if(numRows > 1){
            for (int i = 0; i < length; i = i + depth) {
                str.append(s.charAt(i));
            }
            for (int i = 1; i < numRows - 1; i++) {
                int index1 = i;
                int index2 = depth - index1;
                while (true) {
                    if (index1 >= length)
                        break;
                    str.append(s.charAt(index1));
                    index1 = index1 + depth;
                    if (index2 >= length)
                        break;
                    str.append(s.charAt(index2));
                    index2 = index2 + depth;
                }
            }
            for (int i = numRows - 1; i < length; i = i + depth) {
                str.append(s.charAt(i));
            }
        }else {
            return s;
        }

        return str.toString();
    }

}
