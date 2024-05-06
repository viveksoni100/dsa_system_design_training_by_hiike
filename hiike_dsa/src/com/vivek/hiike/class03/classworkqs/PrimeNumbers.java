package com.vivek.hiike.class03.classworkqs;

import java.util.ArrayList;
import java.util.List;

/**
 * 5.Prime numbers
 * https://www.interviewbit.com/problems/prime-numbers/?authuser=0
 *
 * Problem Description
 *
 *
 * Given a number A, find all prime numbers up to A (A included).
 * Make sure the returned array is sorted.
 *
 *
 * Problem Constraints
 * 1 <= A <= 106
 *
 *
 * Input Format
 * The first argument is an integer A.
 *
 *
 * Output Format
 * Return array of integers.
 *
 *
 * Example Input
 * A = 7
 *
 *
 * Example Output
 * [2, 3, 5, 7]
 *
 *
 * Example Explanation
 * All primes till 7 are, 2, 3, 5 and 7
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(getAllPrimeNumbersTill(7));
    }

    private static List<Integer> getAllPrimeNumbersTill(int n) {

        List<Integer> ans = new ArrayList<Integer>();

        int[] primeSieveArr = new int[n + 1];
        // Initialize all values to 0
        for (int i = 0; i < n; i++) {
            primeSieveArr[i] = 0;
        }

        for (int i = 2; i <= n; i++) {
            if (primeSieveArr[i] == 0) {
                ans.add(i);
                primeSieveArr[i] = 1;
                // eliminate nos. coming to the table of primeSieveArr[i]
                for (int j = i; j * i <= n; j++) {
                    primeSieveArr[j * i] = 1;
                }
            }
        }
        return ans;
    }
}
