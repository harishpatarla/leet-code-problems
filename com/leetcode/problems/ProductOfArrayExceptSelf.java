package com.leetcode.problems;

//https://leetcode.com/problems/product-of-array-except-self/description/
//Time - O(), space - O()
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];

        int pre = 1, post = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = pre;
            pre = pre * nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = post * result[i];
            post = post * nums[i];
        }
        return result;
    }
}
