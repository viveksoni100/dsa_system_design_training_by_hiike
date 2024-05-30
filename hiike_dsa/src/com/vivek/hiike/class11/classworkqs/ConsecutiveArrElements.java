package com.vivek.hiike.class11.classworkqs;

import java.util.HashMap;
import java.util.Map;

/**
 * 2.Consecutive Array Elements
 * https://www.geeksforgeeks.org/problems/consecutive-array-elements2711/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article&authuser=0
 *
 * Given an unsorted array arr[] of size N, the task is to check whether the array consists of consecutive numbers or not.
 *
 * Example 1:
 *
 * Input: N = 5, arr[] = {5, 4, 2, 1, 3}
 * Output: Yes
 * Explanation: All are consecutive elements,
 * according to this order 1,2,3,4 and 5.
 *
 * Example 2:
 *
 * Input: N = 6, arr[] = {2, 1, 0, -3, -1, -2}
 * Output: Yes
 *
 * Your Task:
 * This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function areConsecutives() that takes array arr[] and integer N as parameters and returns the boolean true if array elements are consecutive else boolean false.
 *
 * Note: If the elements are consecutive driver code outputs Yes otherwise, it outputs No
 *
 * Expected Time Complexity: O(N).
 * Expected Auxiliary Space: O(1).
 *
 */
public class ConsecutiveArrElements {
    public static void main(String[] args) {
//        int[] arr = {2, 1, 0, -3, -1, -2};
//        int[] arr = {5, 4, 2, 1, 3};
        int[] arr = {5, 4, 2, 1, 8};
        int n = arr.length;
        System.out.println(areConsecutives(arr, n));
    }

    static boolean areConsecutives(int arr[], int n) {
        Integer minVal = null;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            minVal = min(minVal, arr[i]);
            map.put(arr[i], 1);
        }
        for (int i = minVal; i < (minVal + (n - 1)); i++) {
            if (map.get(i) == null) {
                return false;
            }
        }
        return true;
    }

    private static int min(Integer minVal, int i) {
        if (minVal != null) {
            if (minVal < i) {
                return minVal;
            } else {
                return i;
            }
        } else {
            return i;
        }
    }
}
