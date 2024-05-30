package com.vivek.hiike.class11.classworkqs;

import java.util.HashMap;
import java.util.Map;

/**
 * 1.Subarray with 0 sum
 * https://www.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article&authuser=0
 *
 * Given an array of integers. Find if there is a subarray (of size at-least one) with 0 sum.
 * You just need to return true/false depending upon whether there is a subarray present with 0-sum or not.
 * Printing will be taken care by the driver code.
 *
 * Example 1:
 *
 * Input:
 * n = 5
 * arr = {4,2,-3,1,6}
 * Output:
 * Yes
 * Explanation:
 * 2, -3, 1 is the subarray with sum 0.
 *
 * Example 2:
 *
 * Input:
 * n = 5
 * arr = {4,2,0,1,6}
 * Output:
 * Yes
 * Explanation:
 * 0 is one of the element in the array so there exist a subarray with sum 0.
 *
 * You only need to complete the function subArrayExists() that takes array and n as parameters and returns true or false.
 *
 * Expected Time Complexity: O(n).
 * Expected Auxiliary Space: O(n).
 *
 */
public class SubarrayWithZeroSum {

    public static void main(String[] args) {
//        int[] arr = {4, 2, -3, 1, 6};
//        int[] arr = {4, 2, 0, 1, 6};
        int[] arr = {4, 2, 10, 1, 6};
        int n = arr.length;
        System.out.println(findsum(arr, n));
    }

    static boolean findsum(int arr[], int n) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(sum, 1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.get(sum) != null) {
                return true;
            }
            map.put(sum, 1);
        }
        return false;
    }
}
