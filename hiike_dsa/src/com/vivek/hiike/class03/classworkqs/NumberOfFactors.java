package com.vivek.hiike.class03.classworkqs;

/**
 * 2.Number of factors
 * https://www.hackerrank.com/contests/class-3-inclass-questions/challenges/number-of-factors-3
 *
 * Given a number N, find its number of factors.
 *
 * Input Format
 *
 * A single integer N
 *
 * Constraints
 *
 * N>0
 *
 * Output Format
 *
 * An integer representing the number of factors
 *
 * Sample Input 0
 *
 * 12
 *
 * Sample Output 0
 *
 * 6
 *
 * Explanation 0
 *
 * 12 has 6 factors: 1, 2, 3, 4, 6, 12
 */
public class NumberOfFactors {
    public static void main(String[] args) {
        System.out.println(calculateNumberOfFactors(12));
    }

    private static int calculateNumberOfFactors(int a) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                count += 2;
            }
        }
        if (Math.sqrt(a) * Math.sqrt(a) == a) {
            count--;
        }
        return count;
    }
}
