package com.learn.leetcode.week2;

import com.learn.leetcode.week1.struct.ListNode;

import java.util.List;

public class SolutionHasCycle {
    /**
     * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
     * 如果 pos 是 -1，则在该链表中没有环。
     * @param head
     * @return
     */
    public static boolean hasCycle(ListNode head) {
        if(null == head)
            return false;
        ListNode slow = head;
        ListNode fast = head;
        while(true){
            slow = goahead(slow,1);
            fast = goahead(fast,2);
            if(null == slow || null == fast){
                break;
            }else if(slow.equals(fast)){
                return true;
            }
        }
        return false;
    }

    private static ListNode goahead(ListNode head,int step){
        for (int i = 0; i < step; i++) {
            if(null != head){
                head = head.next;
            }else{
                break;
            }
        }
        return head;
    }
}
