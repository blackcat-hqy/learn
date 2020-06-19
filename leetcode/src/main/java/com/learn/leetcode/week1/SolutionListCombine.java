package com.learn.leetcode.week1;

import com.learn.leetcode.week1.struct.ListNode;

public class SolutionListCombine {
    /**
     * 合并两个有序链表
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode head = null;
        ListNode cur = null;
        while(null!=l1||null!=l2){
            if(null == head){
                head = new ListNode();
                cur = head;
            }else{
                cur.next = new ListNode();
                cur = cur.next;
            }
            if(null==l1){
                cur.val = l2.val;
                l2 = l2.next;
            }else if(null == l2){
                cur.val = l1.val;
                l1 = l1.next;
            }else if(l1.val>l2.val){
                cur.val = l2.val;
                l2 = l2.next;
            }else{
                cur.val = l1.val;
                l1 = l1.next;
            }
        }
        return head;
    }

    public static void printList(ListNode ls){
        while(null != ls){
            System.out.print(ls.val+" ");
            ls = ls.next;
        }
        System.out.println();
    }
}
