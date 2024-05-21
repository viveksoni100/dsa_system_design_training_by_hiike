package com.vivek.hiike.class07.classworkqs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 2.Subset
 * https://www.interviewbit.com/problems/subset/?authuser=0
 *
 * Problem Description
 *
 *
 * Given a set of distinct integers, A, return all possible subsets.
 *
 * Note:
 *
 *     Elements in a subset must be in non-descending order.
 *     The solution set must not contain duplicate subsets.
 *     Also, the subsets should be sorted in ascending ( lexicographic ) order.
 *     The list is not necessarily sorted.
 *
 * Example Input
 * A = [1, 2, 3]
 *
 *
 * Example Output
 *
 * [
 *  [],
 *  [1],
 *  [1, 2],
 *  [1, 2, 3],
 *  [1, 3],
 *  [2],
 *  [2, 3],
 *  [3],
 * ]
 */
public class Subset {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3};
        List<Stack<Integer>> ans = new ArrayList<Stack<Integer>>();
        Stack<Integer> temp = new Stack<Integer>();
        populate(ans, a, 0, temp);
        System.out.println(ans);
    }

    private static void populate(List<Stack<Integer>> ans, int[] a, int ind, Stack<Integer> temp) {
        if (ind == a.length) {
            ans.add(temp);
            return;
        }
        temp.push(a[ind]);
        populate(ans, a, ind + 1, temp);
        temp.pop();
        populate(ans, a, ind + 1, temp);
    }
}
