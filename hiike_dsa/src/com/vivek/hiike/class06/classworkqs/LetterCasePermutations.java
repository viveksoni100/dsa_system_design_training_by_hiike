package com.vivek.hiike.class06.classworkqs;

import java.util.ArrayList;
import java.util.List;

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
        String s = "3z4";
//        String s = "a1b2";
        System.out.println(sol.letterCasePermutation(s));
    }

}
