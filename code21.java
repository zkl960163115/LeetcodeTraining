package com.zkl.code21;

import com.zkl.ListNode;
import com.zkl.ListNodeUtils;

/**
 * Created by ZKL on 2016/11/14  16:18
 */
public class code21 {
    public static void main(String[] args){

        int[] nums1 = {1,3,4,6,9};
        ListNode list1 = ListNodeUtils.InitList(nums1);

        int[] nums2 = {2,3,5,8,9};
        ListNode list2 = ListNodeUtils.InitList(nums2);

        list1 = code21.mergeTwoLists(list1,list2);

        ListNodeUtils.Print(list1);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode head = null;
        if(l1.val <= l2.val){
            head = l1;
            l1 = l1.next;
        }else {
            head = l2;
            l2 = l2.next;
        }
        ListNode nextNode = head;

        while (l1!=null && l2!=null){
            if(l1.val <= l2.val){
                nextNode.next = l1;
                nextNode = nextNode.next;
                l1 = l1.next;
            }else {
                nextNode.next = l2;
                nextNode = nextNode.next;
                l2 = l2.next;
            }
        }

        if(l1 == null){
            nextNode.next = l2;
        }
        if(l2 == null){
            nextNode.next = l1;
        }

        return head;
    }
}
