package com.vivek.hiike.class11.classworkqs;

import java.util.HashMap;
import java.util.Map;

/**
 * 4.Subarray Sum Equals K
 * https://leetcode.com/problems/subarray-sum-equals-k/description/?authuser=0
 *
 * Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 * Example 1:
 *
 * Input: nums = [1,1,1], k = 2
 * Output: 2
 *
 * Example 2:
 *
 * Input: nums = [1,2,3], k = 3
 * Output: 2
 */
public class SubarraySumEqualsK {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3};
        int[] nums = {1, 1, 1};
//        int k = 3;
        int k = 2;
        System.out.println(subarraySum(nums, k));
    }

    public static int subarraySum(int[] nums, int k) {
        int ans = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(sum, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.get(sum - k) != null) {
                ans += map.get(sum - k);
            }
            map.put(sum, 1);
        }
        return ans;
    }
}
