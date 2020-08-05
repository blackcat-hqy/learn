package com.learn.leetcode.week4;


import java.util.HashMap;

/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 */
public class SolutionIsAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if(map.containsKey(c))
                map.replace(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        for (int i = 0; i < t.length(); i++) {
            Character c = t.charAt(i);
            if(!map.containsKey(c))
                return false;
            else if(map.get(c).equals(Integer.valueOf(0))){
                return false;
            }else{
                map.replace(c,map.get(c)-1);
            }
        }
        return true;
    }
}
