package com.learn.leetcode.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SolutionTriangleGenerate {
    /**
     * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
     * @param numRows
     * @return
     */
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if(0 == numRows){
            return ans;
        }
        Integer[] row = {1};
        ans.add(Arrays.asList(row));
        int numCols = 2;
        for (int i = 1; i < numRows; i++) {
            row = new Integer[numCols];
            row[0] = 1;
            row[numCols-1] = 1;
            for (int j = 1; j < numCols-1; j++) {
                List<Integer> lastRow = ans.get(i-1);
                row[j] = lastRow.get(j-1)+lastRow.get(j);
            }
            ans.add(Arrays.asList(row));
            numCols++;
        }
        return ans;
    }
}
