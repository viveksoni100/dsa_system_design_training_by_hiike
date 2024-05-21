package com.vivek.hiike.class10.classworkqs;

import java.util.Arrays;

/**
 * 3.Chocolate Distribution Problem
 * https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1?authuser=0
 *
 * Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet. Each packet
 * can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets among M students such that :
 * 1. Each student gets exactly one packet.
 * 2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.
 *
 * Example 1:
 *
 * Input:
 * N = 8, M = 5
 * A = {3, 4, 1, 9, 56, 7, 9, 12}
 * Output: 6
 * Explanation: The minimum difference between maximum chocolates and minimum chocolates is 9 - 3 = 6 by choosing following M packets :{3, 4, 9, 7, 9}.
 *
 * Example 2:
 *
 * Input:
 * N = 7, M = 3
 * A = {7, 3, 2, 4, 9, 12, 56}
 * Output: 2
 * Explanation: The minimum difference between maximum chocolates and minimum chocolates is 4 - 2 = 2 by choosing following M packets :{3, 2, 4}.
 *
 * Your Task:
 * You don't need to take any input or print anything. Your task is to complete the function findMinDiff()
 * which takes array A[ ], N and M as input parameters and returns the minimum possible difference between maximum number of chocolates
 * given to a student and minimum number of chocolates given to a student.
 *
 * Expected Time Complexity: O(N*Log(N))
 * Expected Auxiliary Space: O(1)
 *
 */
public class ChocolateDistributionProblem {
    public static void main(String[] args) {
//        int[] a = {3, 4, 1, 9, 56, 7, 9, 12};
        int[] a = {7, 3, 2, 4, 9, 12, 56};
//        int k = 5;
        int k = 3;
        System.out.println(getTheMinimumDiffOfChocolatePackets(a, k));
    }

    private static int getTheMinimumDiffOfChocolatePackets(int[] a, int k) {
        a = sort(a);
        int p1 = 0, p2 = k - 1;
        int ans = Integer.MAX_VALUE;
        while (p2 < a.length) {
            ans = min(ans, (a[p2] - a[p1]));
            p1++;
            p2++;
        }
        return ans;
    }

    private static int min(int j, int i) {
        if (j < i)
            return j;
        return i;
    }

    private static int[] sort(int[] a) {
        int temp = 0;
        for(int i=0; i<a.length; i++) {
            for(int j=i+1; j<a.length; j++) {
                if (a[j] < a[i]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
