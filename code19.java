package com.zkl.code19;

import com.zkl.ListNode;
import com.zkl.ListNodeUtils;

/**
 * Created by ZKL on 2016/11/14  16:59
 */
public class code19 {
    public static void main(String[] args){
        int[] nums1 = {1,3,4,6,9};
        ListNode list1 = ListNodeUtils.InitList(nums1);
        list1 = code19.removeNthFromEnd(list1,5);
        ListNodeUtils.Print(list1);
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        ListNode preHead = head;
        ListNode nextHead = head;
        for (int i = 0; i < n; i++){
            preHead = preHead.next;
        }
        //删除的是头结点
        if(preHead == null){
            head = head.next;
            return head;
        }
        while (preHead.next!=null){
            preHead = preHead.next;
            nextHead = nextHead.next;
        }
        nextHead.next = nextHead.next.next;
        return head;
    }
}
