package com.vivek.hiike.class01.classworkqs;

import java.util.ArrayList;

/**
 * 3.Add One to Number
 * https://www.interviewbit.com/problems/add-one-to-number/?authuser=0
 *
 * Example Input
 * Input 1:
 *
 * [1, 2, 3]
 *
 *
 * Example Output
 * Output 1:
 *
 * [1, 2, 4]
 */

public class AddOneToNumber {
    public static void main(String[] args) {
        ArrayList<Integer> zeroIncludedArr = new ArrayList<Integer>();
        zeroIncludedArr.add(0);
        zeroIncludedArr.add(1);
        zeroIncludedArr.add(2);
        zeroIncludedArr.add(3);
        System.out.println(plusOne(zeroIncludedArr));
    }

    public static ArrayList<Integer> plusOne(ArrayList<Integer> arr) {

        /**
         * remove first 0s
         */
        while (arr.size() > 0 & arr.get(0) == 0) {
            arr.remove(0);
        }

        int carry = 1;
        for (int i = arr.size() - 1; i >= 0; i--) {
            arr.set(i, arr.get(i) + carry);
            carry = arr.get(i) / 10;
            arr.set(i, arr.get(i) % 10);
        }

        if (carry == 1) {
            arr.add(0, 1);
        }
        return arr;
    }
}
