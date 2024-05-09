package com.vivek.hiike.class05.classworkqs;

/**
 * 2.Single Number ||
 * https://www.interviewbit.com/problems/single-number-ii/?authuser=0
 *
 * Problem Description
 *
 *
 *
 * Given an array of integers, every element appears thrice except for one, which occurs once.
 *  Find that element that does not appear thrice.
 *  NOTE: Your algorithm should have a linear runtime complexity.
 *  Can you implement it without using extra memory?
 *
 *  Example Input
 *
 * Input 1:
 *
 *  A = [1, 2, 4, 3, 3, 2, 2, 3, 1, 1]
 *
 * Input 2:
 *
 *  A = [0, 0, 0, 1]
 *
 *
 *
 * Example Output
 *
 * Output 1:
 *
 *  4
 *
 * Output 2:
 *
 *  1
 *
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 *
 *  4 occurs exactly once in Input 1.
 *  1 occurs exactly once in Input 2.
 *
 *  
 */
public class SingleNumber2 {
    public static void main(String[] args) {
//        int[] a = {1, 2, 4, 3, 3, 2, 2, 3, 1, 1};
        int[] a = {0, 0, 0, 1};
        System.out.println(printSingleNumber2(a));
    }

    private static int printSingleNumber2(int[] a) {
        int[] arr = new int[32];
        for (int i = 0; i < 32; i++) {
            int num = 1 << i;
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if ((a[j] & num) > 0) {
                    count++;
                }
            }
            arr[i] = count;
        }
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            if (arr[i] % 3 != 0) {
                ans = (1 << i) | ans;
            }
        }
        return ans;
    }
}
