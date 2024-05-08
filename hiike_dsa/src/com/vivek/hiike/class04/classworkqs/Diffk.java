package com.vivek.hiike.class04.classworkqs;

/**
 * 2.Diffk
 * https://www.interviewbit.com/problems/diffk/?authuser=0
 *
 * Given an array 'A' of sorted integers and another non-negative integer B, find if there exist 2 indices i and j such that A[i] - A[j] = k, i != j.
 * Return 0 / 1 ( 0 for false, 1 for true ) for this problem
 * Try doing this in less than linear space complexity.
 *
 * Example Input
 *
 *  A : [1 3 5]
 *  B : 4
 *
 *
 *
 * Example Output
 *
 * 1
 *
 * Example Explanation
 *
 * For the given,
 *  A : [1 3 5]
 *  B : 4
 * Output : YES
 * as 5 - 1 = 4
 */
public class Diffk {
    public static void main(String[] args) {
//        int[] a = {1, 3, 5};
        int[] a = {1, 3, 5, 6, 10, 25, 3, 6};
        int b = 20;
        System.out.println(isDiffKExists(a, b));
    }

    private static int isDiffKExists(int[] a, int b) {
        int p1 = 0, p2 = 1;
        while (p2 < a.length) {
            if (a[p2] - a[p1] == b)
                return 1;
            else if (a[p2] - a[p1] > b)
                p1++;
            else if (a[p2] - a[p1] < b)
                p2++;
        }
        return 0;
    }
}
