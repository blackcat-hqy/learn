package com.learn.leetcode.week4;

import java.util.HashMap;

public class SolutionIsIsomorphic {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character schar = s.charAt(i);
            Character tchar = t.charAt(i);
            if(!map.containsKey(schar)&&!map.values().contains(tchar)) {
                map.put(schar, tchar);
            }
            if(map.containsKey(schar)&&map.get(schar).equals(tchar)){
                continue;
            }
            return false;
        }
        return true;
    }
}
