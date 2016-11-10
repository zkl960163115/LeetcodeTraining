package com.zkl.code24;

import com.zkl.ListNode;
import com.zkl.ListNodeUtils;

import java.util.List;
import java.util.Scanner;

/**
 * Created by ZKL on 2016/11/10  13:14
 */
public class code24 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        ListNode list = ListNodeUtils.InitList(nums);
        list = code24.swapPairs(list);
        ListNodeUtils.Print(list);
    }

    public static ListNode swapPairs(ListNode head) {

        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode top = head;
        head = top.next;
        top.next = top.next.next;
        head.next = top;

        while (top != null){
            if(top.next != null){
                ListNode middle = top.next;
                if(middle.next != null){
                    ListNode bottom = middle.next;

                    middle.next = bottom.next;
                    bottom.next = middle;
                    top.next = bottom;

                    top = middle;
                }else {
                    break;
                }
            }else {
                break;
            }
        }

        return head;
    }

}
