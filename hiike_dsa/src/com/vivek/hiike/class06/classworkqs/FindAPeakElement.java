package com.vivek.hiike.class06.classworkqs;

/**
 * 2.Find a peak element
 * https://www.interviewbit.com/problems/find-a-peak-element/?authuser=0
 *
 * Given an array of integers A, find and return the peak element in it.
 *
 * An array element is peak if it is NOT smaller than its neighbors.
 *
 * For corner elements, we need to consider only one neighbor.
 *
 * For example, for input array {5, 10, 20, 15}, 20 is the only peak element.
 *
 * Following corner cases give better idea about the problem.
 *
 * 1) If input array is sorted in strictly increasing order, the last element is always a peak element.
 * For example, 5 is peak element in {1, 2, 3, 4, 5}.
 * 2) If input array is sorted in strictly decreasing order, the first element is always a peak element.
 * 10 is the peak element in {10, 9, 8, 7, 6}.
 *
 * Note: It is guranteed that the answer is unique.
 *
 * For Example
 *
 * Input 1:
 *     A = [1, 2, 3, 4, 5]
 * Output 1:
 *     5
 *
 * Input 2:
 *     A = [5, 17, 100, 11]
 * Output 2:
 *     100
 *
 */
public class FindAPeakElement {
    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 5};
        int[] a = {5, 17, 100, 11};
        System.out.println(a[getAPeakElement(a)]);
    }

    private static int getAPeakElement(int[] a) {
        int s = 0, e = a.length-1, m;
        if (a.length == 1) {
            return 0;
        }
        while (s <= e) {
            m = s + ((e - s) / 2);
            //left corner
            if (m == 0) {
                if (a[m + 1] < a[m]) {
                    return m;
                } else {
                    s = m + 1;
                }
                //right corner
            } else if (m == a.length - 1) {
                if (a[m - 1] < a[m]) {
                    return m;
                } else {
                    e = m - 1;
                }
                // middle
            } else if (a[m + 1] < a[m] && a[m - 1] < a[m]) {
                return m;
            } else if (a[m + 1] > a[m]) {
                 s = m + 1;
            } else {
                e = m + 1;
            }
        }
        return 0;
    }
}
