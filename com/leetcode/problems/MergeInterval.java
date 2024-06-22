package com.leetcode.problems;
// https://leetcode.com/problems/merge-intervals/

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeInterval {

    public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        LinkedList<int[]> ans = new LinkedList<>();
        for (int[] interval : intervals) {
            if (ans.isEmpty() || ans.getLast()[1] < interval[0]) {
                ans.add(interval);
            } else {
                ans.getLast()[1] = Math.max(ans.getLast()[1], interval[1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(merge(new int[][]{{2, 6}, {8, 10}, {1, 3}, {15, 18}})));
    }
}
