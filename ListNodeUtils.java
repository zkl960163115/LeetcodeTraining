package zkl;

import java.util.Scanner;

/**
 * Created by 周昆仑 on 2016/5/28.
 */
public class ListNodeUtils {
    public static ListNode Init(int n, Scanner scanner){
        if(n<=0){
            return null;
        }
        ListNode head = new ListNode();
        head.val = scanner.nextInt();
        ListNode p = head;

        for (int i = 0; i < n-1; i++) {
            ListNode temp = new ListNode();
            temp.val = scanner.nextInt();
            p.next = temp;
            p = temp;
        }
        p.next = null;

        return head;
    }

    public static void Print(ListNode list){
        System.out.println();
        while(list != null){
            System.out.print(list.val + " ");
            list = list.next;
        }
        System.out.println();
    }
}
