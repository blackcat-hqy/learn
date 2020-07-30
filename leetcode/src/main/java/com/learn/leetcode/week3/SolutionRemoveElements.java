package com.learn.leetcode.week3;

import com.learn.leetcode.week1.struct.ListNode;

/**
 * 删除链表中等于给定值 val 的所有节点。
 */
public class SolutionRemoveElements {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode current = head;
        ListNode before = null;
        while(current!=null){
            if(current.val == val){
                if(current == head){
                    head = current.next;
                    before = current;
                    current = current.next;
                }else if(current.next!= null){
                    current.val = current.next.val;
                    current.next = current.next.next;
                    before.next = current;
                }else if(current.next == null){
                    before.next = null;
                    current = null;
                }
            }else{
                before = current;
                current = current.next;
            }
        }
        return head;
    }
}
