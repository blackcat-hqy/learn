package com.learn.leetcode.week1;

import java.util.ArrayList;
import java.util.List;

public class SolutionIsBracketValid {
    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
     *
     * 有效字符串需满足：
     *
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     * 注意空字符串可被认为是有效字符串。
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if(bracket == '('||bracket=='['||bracket=='{'){
                list.add(bracket);
            }else if(list.isEmpty()){
                return false;
            }else{
                char lbracket = list.get(list.size()-1);
                if (bracket == ')' && lbracket =='('
                        ||bracket==']'&&lbracket=='['||bracket=='}'&&lbracket=='{')
                    list.remove(list.size()-1);
                else
                    return false;
            }
        }
        return list.isEmpty();
    }
}
