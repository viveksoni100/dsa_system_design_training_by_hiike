package com.vivek.hiike.class05.classworkqs;

/**
 * 1.Single Number
 * https://www.interviewbit.com/problems/single-number/?authuser=0
 *
 * Problem Description
 *
 *
 *
 * Given an array of integers A, every element appears twice except for one. Find that single one.
 *
 *
 * NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example Input
 *
 * Input 1:
 *
 *  A = [1, 2, 2, 3, 1]
 *
 * Input 2:
 *
 *  A = [1, 2, 2]
 *
 *
 *
 * Example Output
 *
 * Output 1:
 *
 *  3
 *
 * Output 2:
 *
 *  1
 *
 *  Example Explanation
 *
 * Explanation 1:
 *
 * 3 occurs once.
 *
 * Explanation 2:
 *
 * 1 occurs once.
 *
 */
public class SingleNumber {
    public static void main(String[] args) {
//        int[] a = {1, 2, 2, 3, 1};
        int[] a = {1, 2, 2};
        System.out.println(printSingleNumber(a));
    }

    private static int printSingleNumber(int[] a) {
        int num = a[0];
        for (int i = 1; i < a.length; i++) {
            num = num ^ a[i];
        }
        return num;
    }
}
