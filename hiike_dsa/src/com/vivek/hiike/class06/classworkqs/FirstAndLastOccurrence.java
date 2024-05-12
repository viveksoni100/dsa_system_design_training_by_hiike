package com.vivek.hiike.class06.classworkqs;

/**
 * 1.First and last occurrence of x
 * https://www.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1?authuser=0
 *
 * Given a sorted array arr containing n elements with possibly some duplicate,
 * the task is to find the first and last occurrences of an element x in the given array.
 * Note: If the number x is not found in the array then return both the indices as -1.
 *
 * Example 1:
 *
 * Input:
 * n=9, x=5
 * arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
 * Output:
 * 2 5
 * Explanation:
 * First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5.
 *
 * Example 2:
 *
 * Input:
 * n=9, x=7
 * arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 }
 * Output:
 * 6 6
 * Explanation:
 * First and last occurrence of 7 is at index 6.
 *
 * Your Task:
 * Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function find() that takes array arr, integer n and integer x as parameters and returns the required answer.
 *
 * Expected Time Complexity: O(logN)
 * Expected Auxiliary Space: O(1).
 */
public class FirstAndLastOccurrence {
    public static void main(String[] args) {
//        int[] a = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int[] a = {1, 3, 5, 5, 5, 5, 7, 123, 125};
//        int k = 5;
        int k = 7;
        printFirstAndLastOccurrence(a, k);
    }

    private static void printFirstAndLastOccurrence(int[] a, int k) {
        int s = 0, e = a.length - 1;
        int firstO = -1, lastO = -1;
        int m = 0;
        // first occurrence
        while (s <= e) {
            m = s + ((e-s)/2);
            if (a[m] == k) {
                firstO = m;
                e = m - 1;
            }
            else if (a[m] > k) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        System.out.print(firstO + " ");

        // last occurrence
        s = 0;
        e = a.length - 1;
        m = 0;
        while (s <= e) {
            m = s + ((e-s)/2);
            if (a[m] == k) {
                lastO = m;
                s = m + 1;
            }
            else if (a[m] > k) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        System.out.print(lastO);
    }
}
