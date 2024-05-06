package com.vivek.hiike.class02.classworkqs;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 3.Rain Water Trapped
 * https://www.interviewbit.com/problems/rain-water-trapped/?authuser=0
 *
 * Problem Description
 *
 * Given an integer array A of non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it is able to trap after raining.
 *
 * Problem Constraints
 * 1 <= |A| <= 100000
 *
 * Input Format
 * The only argument given is integer array A.
 *
 *
 *
 * Output Format
 * Return the total water it is able to trap after raining.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
 * Input 2:
 *
 *  A = [1, 2]
 *
 *
 * Example Output
 * Output 1:
 *
 *  6
 * Output 2:
 *
 *  0
 *
 *  Example Explanation
 * Explanation 1:
 *
 *
 *  In this case, 6 units of rain water (blue section) are being trapped.
 * Explanation 2:
 *
 *  No water is trapped.
 */

public class RainWaterTrapped {
    public static void main(String[] args) {
//        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1));
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1, 2));
        System.out.println(calculateWaterTrapped(a));
    }

    private static int calculateWaterTrapped(ArrayList<Integer> a) {
        int tallest_building = 0;
        int tallest_index = 0;
        for (int i = 0; i < a.size(); i++) {
            if (tallest_building < a.get(i)) {
                tallest_building = a.get(i);
                tallest_index = i;
            }
        }
        int ans = 0;
        int maxL = 0;
        int maxR = 0;

        // p-1
        for (int i = 0; i < tallest_index; i++) {
            maxL = max(maxL, a.get(i));
            ans += maxL - a.get(i);
        }

        // p-2
        for (int i = a.size() - 1; i > tallest_index; i--) {
            maxR = max(maxR, a.get(i));
            ans += maxR - a.get(i);
        }

        return ans;
    }

    private static int max(int max, Integer integer) {
        if (max > integer)
            return max;
        return integer;
    }
}
