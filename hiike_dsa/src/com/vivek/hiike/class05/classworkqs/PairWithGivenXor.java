package com.vivek.hiike.class05.classworkqs;

import java.util.HashMap;
import java.util.Map;

/**
 * 4.Pairs With Given Xor
 * https://www.interviewbit.com/problems/pairs-with-given-xor/?authuser=0
 *
 * Problem Description
 *
 * Given an 1D integer array A containing N distinct integers.
 *
 * Find the number of unique pairs of integers in the array whose XOR is equal to B.
 *
 * NOTE:
 *
 *     Pair (a, b) and (b, a) is considered to be same and should be counted once.
 *
 * Example Input
 *
 * Input 1:
 *
 *  A = [5, 4, 10, 15, 7, 6]
 *  B = 5
 *
 * Input 2:
 *
 *  A = [3, 6, 8, 10, 15, 50]
 *  B = 5
 *
 *
 *
 * Example Output
 *
 * Output 1:
 *
 *  1
 *
 * Output 2:
 *
 *  2
 *
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 *
 *  (10 ^ 15) = 5
 *
 * Explanation 2:
 *
 *  (3 ^ 6) = 5 and (10 ^ 15) = 5
 */

public class PairWithGivenXor {
    public static void main(String[] args) {
//        int[] a = {5, 4, 10, 15, 7, 6};
        int[] a = {3, 6, 8, 10, 15, 50};
        int b = 5;
        System.out.println(getNoOfPairsWithGivenXor(a, b));
    }

    private static int getNoOfPairsWithGivenXor(int[] a, int b) {
        int count = 0;
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i=0; i<a.length; i++) {
            m.put(a[i], 1);
        }
        for (int i=0; i<a.length; i++) {
            if (m.get(a[i] ^ b) != null) {
                count++;
            }
        }
        return count/2;
    }

}
