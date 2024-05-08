package com.vivek.hiike.class04.classworkqs;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * 3.Container With Most Water
 * https://www.interviewbit.com/problems/container-with-most-water/?authuser=0
 *
 * Given n non-negative integers a1, a2, ..., an,
 *
 * where each represents a point at coordinate (i, ai).
 *
 * 'n' vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 *
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 *
 * Your program should return an integer which corresponds to the maximum area of water that can be contained ( Yes, we know maximum area instead of maximum volume sounds weird. But this is 2D plane we are working with for simplicity ).
 *
 *     Note: You may not slant the container.
 *
 * Example :
 *
 * Input : [1, 5, 4, 3]
 * Output : 6
 *
 * Explanation : 5 and 3 are distance 2 apart. So size of the base = 2. Height of container = min(5, 3) = 3.
 * So total area = 3 * 2 = 6
 *
 */
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] a = {1, 5, 4, 3};
        System.out.println(getMostContainedWaterMeasure(a));
    }

    private static int getMostContainedWaterMeasure(int[] a) {
        int ans = 0, p1 = 0, p2 = a.length - 1;
        while (p1 < p2) {
            ans = max(ans, min(a[p1], a[p2])) * (p2 - p1);
            if (a[p1] <= a[p2]) {
                p1++;
            } else {
                p2--;
            }
        }
        return ans;
    }
}
