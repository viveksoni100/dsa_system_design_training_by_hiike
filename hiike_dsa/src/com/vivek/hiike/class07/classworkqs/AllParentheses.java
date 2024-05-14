package com.vivek.hiike.class07.classworkqs;

import java.util.ArrayList;

/**
 * 1.Generate All Parentheses II
 * https://www.interviewbit.com/problems/generate-all-parentheses-ii/?authuser=0
 *
 * Given an integer A pairs of parentheses, write a function to generate all combinations of well-formed parentheses of length 2*A.
 *
 * Example Input
 *
 * Input 1:
 *
 * A = 3
 *
 * Input 2:
 *
 * A = 1
 *
 *
 *
 * Example Output
 *
 * Output 1:
 *
 * [ "((()))", "(()())", "(())()", "()(())", "()()()" ]
 *
 * Output 2:
 *
 * [ "()" ]
 *
 * Example Explanation
 *
 * Explanation 1:
 *
 *  All paranthesis are given in the output list.
 *
 * Explanation 2:
 *
 *  All paranthesis are given in the output list.
 */
public class AllParentheses {
    public static void main(String[] args) {
        int a = 3;
        ArrayList<String> str = new ArrayList<String>();
        String temp = "";
        populate(str, a, 0, 0, temp);
        System.out.println(str);
    }

    private static void populate(ArrayList<String> str, int a, int open, int close, String temp) {
        if (close == a) {
            str.add(temp);
            return;
        }
        if (open < a) {
            populate(str, a, open + 1, close, temp + '(');
        }
        if (close < open) {
            populate(str, a, open, close + 1, temp + ')');
        }
    }
}
