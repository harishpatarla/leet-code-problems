package com.leetcode.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndexMap = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int reminder = target - nums[i];
            if (numIndexMap.containsKey(reminder)) {
                return new int[]{numIndexMap.get(reminder), i};
            }
            numIndexMap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 8, 2, 15, 5}, 13)));
    }
}

