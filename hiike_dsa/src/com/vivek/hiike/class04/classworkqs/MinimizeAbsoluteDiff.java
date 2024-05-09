package com.vivek.hiike.class04.classworkqs;

/**
 * 4.Minimize the absolute difference
 * https://www.interviewbit.com/problems/minimize-the-absolute-difference/?authuser=0
 *
 * Given three sorted arrays A, B  and Cof not necessarily same sizes.
 *
 * Calculate the minimum absolute difference between the maximum and minimum number from the triplet a, b, c such that a, b, c belongs arrays A, B, C respectively.
 *
 * i.e. minimize | max(a,b,c) - min(a,b,c) |.
 *
 * Example :
 *
 * Input:
 *
 * A : [ 1, 4, 5, 8, 10 ]
 * B : [ 6, 9, 15 ]
 * C : [ 2, 3, 6, 6 ]
 *
 * Output:
 *
 * 1
 *
 * Explanation: We get the minimum difference for a=5, b=6, c=6 as | max(a,b,c) - min(a,b,c) | = |6-5| = 1.
 */
public class MinimizeAbsoluteDiff {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 8, 10};
        int[] b = {6, 9, 15};
        int[] c = {2, 3, 6, 6};
        System.out.println(calculateMinimumAbsoluteDiff(a, b, c));
    }

    private static int calculateMinimumAbsoluteDiff(int[] a, int[] b, int[] c) {
        return -1;
    }
}
