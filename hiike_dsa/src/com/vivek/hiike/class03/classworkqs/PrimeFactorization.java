package com.vivek.hiike.class03.classworkqs;

/**
 * 4.Prime factorization
 * https://www.hackerrank.com/contests/class-3-inclass-questions/challenges/prime-factorization-14-1
 *
 * Given a number N, print its prime factorization.
 *
 * Input Format
 *
 * An integer N
 *
 * Constraints
 *
 * N ≥ 1
 *
 * Output Format
 *
 * Print the prime factors separated by spaces.
 *
 * Sample Input 0
 *
 * 12
 *
 * Sample Output 0
 *
 * 2 2 3
 *
 * Explanation 0
 *
 * 2 x 2 x 3 = 12
 *
 * Sample Input 1
 *
 * 7
 *
 * Sample Output 1
 *
 * 7
 *
 * Explanation 1
 *
 * 1 x 7 = 7
 */
public class PrimeFactorization {
    public static void main(String[] args) {
        printPrimeFactorizationOf(12);
    }

    private static void printPrimeFactorizationOf(int n) {
        int num = 2;
        while (num <= n) {
            if (n % num == 0) {
                System.out.print(num + " ");
                n = n / num;
            } else
                num++;
        }
    }
}
