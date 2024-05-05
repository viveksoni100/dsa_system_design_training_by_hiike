package com.vivek.hiike.class02.classworkqs;

/**
 * 2.Majority Element
 * https://www.interviewbit.com/problems/majority-element/?authuser=0
 *
 * Given an array of size N, find the majority element. The majority element is the element that appears more than floor(N/2) times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Problem Constraints
 * 1 <= |A| <= 106
 * 1 <= Ai <= 109
 *
 * Example Input
 * A = [2, 1, 2]
 *
 *
 * Example Output
 * 2
 *
 * Example Explanation
 * 2 occurs 2 times which is greater than 3/2.
 *
 */
public class MajorityElement {
    public static void main(String[] args) {
//        int[] A = {2, 3, 1, 1, 4, 1, 2, 2, 1, 1, 1};
        int[] A = {2, 2, 2, 2, 4, 3, 2, 2, 7, 8, 9};
        System.out.println(findMejorityElement(A));
    }

    private static int findMejorityElement(int[] a) {
        //sorting
        for (int i=0; i<a.length; i++) {
            int temp = 0;
            for (int j=i+1; j<a.length; j++) {
                if (a[j] < a[i]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        //returning a[n/2]th element back
        return a[a.length/2];
    }


}
