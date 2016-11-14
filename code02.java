package com.zkl.code02;

import com.zkl.ListNode;
import com.zkl.ListNodeUtils;

/**
 * Created by ZKL on 2016/11/14  19:55
 */
public class code02 {

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 7, 9};
        ListNode list1 = ListNodeUtils.InitList(nums1);

        int[] nums2 = {2, 3, 5};
        ListNode list2 = ListNodeUtils.InitList(nums2);

        list1 = code02.addTwoNumbers(list1, list2);

        ListNodeUtils.Print(list1);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head = new ListNode(1);
        ListNode head1 = head;
        head.next = l1;
        boolean overFlag = false;
        while (l1 != null && l2 != null) {
            int temp = l1.val + l2.val;
            if (overFlag) {
                temp++;
            }
            if (temp >= 10) {
                l1.val = temp - 10;
                overFlag = true;
                l1 = l1.next;
                l2 = l2.next;
            } else {
                l1.val = temp;
                overFlag = false;
                l1 = l1.next;
                l2 = l2.next;
            }
            head1 = head1.next;
        }
        if(l1==null){
            head1.next = l2;
        }
        while (head1.next!=null&&overFlag){
            head1.next.val++;
            if(head1.next.val>=10){
                head1.next.val -= 10;
                head1 = head1.next;
            }else {
                break;
            }
        }
        if(head1.next==null) {
            if (overFlag) {
                ListNode node = new ListNode(1);
                node.next = null;
                head1.next = node;
            }
        }
        return head.next;
    }

}
