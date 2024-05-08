package com.vivek.hiike.class04.classworkqs;

import java.util.ArrayList;

/**
 * 1.Smallest sequence with given Primes
 * https://www.interviewbit.com/problems/smallest-sequence-with-given-primes/?authuser=0
 *
 * Given three prime numbers A, B and C and an integer D.
 *
 * You need to find the first(smallest) D integers which only have A, B, C or a combination of them as their prime factors.
 *
 * Input Format
 *
 * First argument is an integer A.
 *
 * Second argument is an integer B.
 *
 * Third argument is an integer C.
 *
 * Fourth argument is an integer D.
 *
 * Return an array of size D denoting the first smallest D integers which only have A, B, C or a combination of them as their prime factors.
 *
 * NOTE: You need to return the array sorted in ascending order.
 *
 * Example Input
 *
 * Input 1:
 *
 *  A = 2
 *  B = 3
 *  C = 5
 *  D = 5
 *
 *  Example Output
 *
 * Output 1:
 *
 *  [2, 3, 4, 5, 6]
 *
 *  Example Explanation
 *
 * Explanation 1:
 *
 *  4 = A * A i.e ( 2 * 2 )
 *  6 = A * B i.e ( 2 * 3 )
 *
 */
public class SmallestSequenceWithGivenPrimes {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 5;
//        int d = 5;
        int d = 7;
        System.out.println(getSmallestSequenceWithGivenPrimes(a, b, c, d));
    }

    private static ArrayList<Integer> getSmallestSequenceWithGivenPrimes(int a, int b, int c, int d) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(1);
        int p1 = 0, p2 = 0, p3 = 0, num = 0;

        while (ans.size() <= d) {
            num = min(min(ans.get(p1) * a, ans.get(p2) * b), ans.get(p3) * c);
            ans.add(num);

            if (num == ans.get(p1) * a)
                p1++;
            if (num == ans.get(p2) * b)
                p2++;
            if (num == ans.get(p3) * c)
                p3++;
        }
        ans.remove(0);
        return ans;
    }

    private static int min(int i1, int i2) {
        if (i1 < i2)
            return i1;
        return i2;
    }
}
