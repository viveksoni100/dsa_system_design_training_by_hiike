package com.vivek.hiike.class01.classworkqs;

import java.util.Arrays;
import java.util.List;

/**
 * 2.Repeat and Missing Number Array
 * https://www.interviewbit.com/problems/repeat-and-missing-number-array/?authuser=0
 * <p>
 * Example:
 * <p>
 * Input:[3 1 2 5 3]
 * <p>
 * Output:[3, 4]
 */

public class RepeatingAndMissingNumber {
    public static void main(String[] args) {
//        System.out.println(repeatedAndMissingNumber(Arrays.asList(1, 2, 3, 3, 5)));
        System.out.println(repeatedAndMissingNumber(Arrays.asList(3, 1, 2, 5, 3)));
//        System.out.println(repeatedAndMissingNumber(Arrays.asList(5, 7, 7, 4, 1, 6, 2, 8, 10, 9, 12, 11)));
    }

    public static List<Integer> repeatedAndMissingNumber(final List<Integer> A) {
        Integer repeatingNum = -1;
        Integer missingNum = -1;
        List<Integer> arr = sortArr(A);

        //if first no is not 1, 1 is the missing no.
        if (arr.get(0) != 1) {
            missingNum = 1;
        }
        //if last no is not arr.size(), arr.size() is the missing no.
        if (arr.get(arr.size() - 1) != arr.size()) {
            missingNum = arr.size();
        }

        //logic for in between nos.
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i - 1) < arr.get(i) - 1) {
                repeatingNum = arr.get(i) - 1;
            }
            if (arr.get(i - 1) == arr.get(i)) {
                missingNum = arr.get(i);
            }
        }

        return Arrays.asList(missingNum, repeatingNum);
    }

    private static List<Integer> sortArr(List<Integer> a) {
        int temp = 0;
        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                 if (a.get(j) < a.get(i)) {
                     temp = a.get(i);
                     a.set(i, a.get(j));
                     a.set(j, temp);
                 }
            }
        }
        return a;
    }
}
