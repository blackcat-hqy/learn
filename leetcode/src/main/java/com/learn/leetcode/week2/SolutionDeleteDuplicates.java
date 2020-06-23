package com.learn.leetcode.week2;

import com.learn.leetcode.week1.struct.ListNode;

public class SolutionDeleteDuplicates {
    /**
     * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
     * @param head
     * @return
     */
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode now = head;
        ListNode next;
        while(null != now){
            next = now.next;
            if(null!=next){
                if(now.val == next.val){
                    now.next = next.next;
                }else{
                    now = next;
                }
            }else{
                break;
            }
        }
        return head;
    }
}
