package com.learn.leetcode.week3;

import com.learn.leetcode.week1.struct.ListNode;

import java.util.HashSet;
import java.util.Set;

public class SolutionGetIntersectionNode {
    /**
     * 编写一个程序，找到两个单链表相交的起始节点。
     * @param headA
     * @param headB
     * @return
     */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> saw = new HashSet<>();
        ListNode intersection = null;
        while(null != headA){
            saw.add(headA);
            headA = headA.next;
        }
        while(null != headB){
            if(saw.contains(headB)){
                intersection = headB;
                break;
            }
            headB = headB.next;
        }
        return intersection;
    }

    /**
     * 拼接两个链表使得两个链表长度相等
     * @param headA
     * @param headB
     * @return
     */
    public static ListNode getIntersectionNode1(ListNode headA, ListNode headB){
        ListNode ha = headA;
        ListNode hb = headB;
        while(ha!=hb){
            ha = null == ha?headB:ha.next;
            hb = null == hb?headA:hb.next;
        }
        return ha;
    }
}
