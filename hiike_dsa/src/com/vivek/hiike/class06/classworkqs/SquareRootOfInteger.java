package com.vivek.hiike.class06.classworkqs;

/**
 * 4.Square Root of Integer
 * https://www.interviewbit.com/problems/square-root-of-integer/?authuser=2
 *
 * Problem Description
 *
 *
 *
 * Given an integer A.
 *
 * Compute and return the square root of A.
 *
 * If A is not a perfect square, return floor(sqrt(A)).
 *
 * DO NOT USE SQRT FUNCTION FROM STANDARD LIBRARY.
 *
 * NOTE: Do not use sort function from standard library. Users are expected to solve this in O(log(A)) time.
 *
 * Example Input
 *
 * Input 1:
 *
 *  11
 *
 * Input 2:
 *
 *  9
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
 *  3
 */
public class SquareRootOfInteger {
    public static void main(String[] args) {
        System.out.println(calculateSquareRootInLinearTC(11));
    }

    private static int calculateSquareRootInLinearTC(int a) {
        int s = 1, e = a, mid = 0, ans = 0;
        while (s <= e) {
            mid = s + ((e - s) / 2);
            if (mid * mid == a) {
                return mid;
            } else if (mid * mid > a) {
                e = mid - 1;
            } else {
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }
}
