package com.vivek.hiike.class10.classworkqs;

import java.util.*;

/**
 * 4.K Closest Points to Origin
 * https://leetcode.com/problems/k-closest-points-to-origin/description/?authuser=0
 *
 * Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k,
 * return the k closest points to the origin (0, 0).
 *
 * The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2)2 + (y1 - y2)2).
 *
 * You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).
 *
 * Example 1:
 *
 * Input: points = [[1,3],[-2,2]], k = 1
 * Output: [[-2,2]]
 * Explanation:
 * The distance between (1, 3) and the origin is sqrt(10).
 * The distance between (-2, 2) and the origin is sqrt(8).
 * Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
 * We only want the closest k = 1 points from the origin, so the answer is just [[-2,2]].
 *
 * Example 2:
 *
 * Input: points = [[3,3],[5,-1],[-2,4]], k = 2
 * Output: [[3,3],[-2,4]]
 * Explanation: The answer [[-2,4],[3,3]] would also be accepted.
 */
public class KClosestPointsToOrigin {
    public static void main(String[] args) {
//        int[][] a = {{1, 3}, {-2, 2}};
        int[][] a = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;
//        int k = 1;
        getKClosestPoints(a, k);
    }

    private static void getKClosestPoints(int[][] a, int k) {
        Map<Integer, int[]> map = new HashMap<Integer, int[]>();
        for (int i = 0; i < a.length; i++) {
            map.put(((a[i][0] * a[i][0]) + (a[i][1] * a[i][1])), new int[]{a[i][0], a[i][1]});
        }
        int c = 1;
        Iterator<Map.Entry<Integer, int[]>> iterator = map.entrySet().iterator();
        for (int i = 0; i < k; i++) {
            System.out.println(Arrays.toString(iterator.next().getValue()));
        }
    }
}
