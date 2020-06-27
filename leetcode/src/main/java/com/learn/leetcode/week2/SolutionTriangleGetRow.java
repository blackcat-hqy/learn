package com.learn.leetcode.week2;

import java.util.Arrays;
import java.util.List;

public class SolutionTriangleGetRow {
    /**
     * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
     * @param rowIndex
     * @return
     */
    public static List<Integer> getRow(int rowIndex) {
        Integer[] row = {1};
        Integer[] lastRow = {1};
        for (int i = 1; i <= rowIndex; i++) {
            row = new Integer[lastRow.length+1];
            row[0] = 1;
            row[row.length-1] = 1;
            for (int j = 1; j < row.length-1; j++) {
                row[j] = lastRow[j-1] + lastRow[j];
            }
            lastRow = row;
        }
        return Arrays.asList(row);
    }
}
