package com.vivek.hiike.class05.classworkqs;

/**
 * 3.Sum of pairwise Hamming Distance
 * https://www.interviewbit.com/problems/sum-of-pairwise-hamming-distance/?authuser=0
 *
 * Problem Description
 *
 * Hamming distance between two non-negative integers is defined as the number of positions at which the corresponding bits are different.
 *
 * Given an array A of N non-negative integers, find the sum of hamming distances of all pairs of integers in the array.
 * Return the answer modulo 1000000007.
 *
 * Example Input
 *
 * Input 1:
 *
 *  A = [1]
 *
 * Input 2:
 *
 *  A = [2, 4, 6]
 *
 *
 *
 * Example Output
 *
 * Output 1:
 *
 *  0
 *
 * Output 2:
 *
 *  8
 *
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 *
 *  No pairs are formed.
 *
 * Explanation 2:
 *
 *  We return, f(2, 2) + f(2, 4) + f(2, 6) + f(4, 2) + f(4, 4) + f(4, 6) + f(6, 2) + f(6, 4) + f(6, 6) = 8
 *
 */
public class SumOfPairwiseHammingDistance {
    public static void main(String[] args) {
//        int[] a = {1};
        int[] a = {2, 4, 6};
        System.out.println(getSumOfPairwiseHammingDistance(a));
    }

    private static long getSumOfPairwiseHammingDistance(int[] a) {
        int[] arr = new int[32];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 32; j++) {
                if ((a[i] & (1<<j)) > 0) {
                    arr[j]++;
                }
            }
        }
        long ans = 0;
        for (int i = 0; i < 32; i++) {
            ans += (arr[i] * (a.length) - arr[i]) % 1000000007;
            ans = ans % 1000000007;
        }
        return (ans * 2) % 1000000007;
    }
}
