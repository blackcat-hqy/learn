package com.learn.leetcode.week4;

import com.learn.leetcode.week1.struct.ListNode;

public class SolutionReverseList {
    public static ListNode reverseList(ListNode head) {
        if(head == null)
            return null;
        ListNode before = null;
        ListNode current = head;
        ListNode next = current.next;
        while(current.next!= null){
            current.next = before;
            before = current;
            current = next;
            next = next.next;
        }
        current.next = before;
        return current;
    }
}
