package com.vivek.hiike.class07.classworkqs;

import java.util.ArrayList;
import java.util.List;

/**
 * 4.Letter Case Permutation
 * https://leetcode.com/problems/letter-case-permutation/description/?authuser=0
 *
 * Given a string s, you can transform every letter individually to be lowercase or uppercase to create another string.
 *
 * Return a list of all possible strings we could create. Return the output in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "a1b2"
 * Output: ["a1b2","a1B2","A1b2","A1B2"]
 *
 * Example 2:
 *
 * Input: s = "3z4"
 * Output: ["3z4","3Z4"]
 *
 */
public class LetterCasePermutations {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<String>();
        recursion(result, s.toCharArray(), 0);
        return result;
    }
    private void recursion(List<String> result, char[] chars, int index) {
        if (index == chars.length) {
            result.add(new String(chars));
            return;
        }

        if (Character.isLetter(chars[index])) {
            chars[index] = Character.toLowerCase(chars[index]);
            recursion(result, chars, index + 1);

            chars[index] = Character.toUpperCase(chars[index]);
            recursion(result, chars, index + 1);
        } else {
            recursion(result, chars, index + 1);
        }
    }
    public static void main(String[] args) {
        LetterCasePermutations sol = new LetterCasePermutations();
//        String s = "3z4";
        String s = "a1b2";
        System.out.println(sol.letterCasePermutation(s));
    }

}
