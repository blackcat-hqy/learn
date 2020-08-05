package com.learn.leetcode.week4;

import com.learn.leetcode.week1.struct.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 请判断一个链表是否为回文链表。
 */
public class SolutionIsPalindrome {
    public boolean isPalindrome(ListNode head) {
        List<Integer> ls = new ArrayList<>();
        ListNode cur = head;
        while(cur!=null){
            ls.add(cur.val);
            cur = cur.next;
        }
        for (int i = 0; i<ls.size()-1-i; i++) {
            if(!ls.get(i).equals(ls.get(ls.size()-1-i)))
                return false;
        }
        return true;
    }
}
