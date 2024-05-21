package com.vivek.hiike.class10.classworkqs;

/**
 * 1.Anagram
 * https://www.geeksforgeeks.org/problems/anagram-1587115620/1?authuser=0
 *
 * Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an
 * anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters
 * can be different. For example, act and tac are an anagram of each other. Strings a and b can only contain lower case alphabets.
 *
 * Note:-
 *
 * If the strings are anagrams you have to return True or else return False
 *
 * Example 1:
 *
 * Input:a = geeksforgeeks, b = forgeeksgeeks
 * Output: YES
 * Explanation: Both the string have same characters with
 *         same frequency. So, both are anagrams.
 *
 * Example 2:
 *
 * Input:a = allergy, b = allergic
 * Output: NO
 * Explanation: Characters in both the strings are
 *         not same, so they are not anagrams.
 *
 */
public class Anagram {
    public static void main(String[] args) {
        /*String a = "geeksforgeeks";
        String b = "forgeeksgeeks";*/
        String a = "allergy";
        String b = "allergic";
        System.out.println(isItAnagram(a, b));
    }

    private static boolean isItAnagram(String a, String b) {
        int[] freq = new int[26];
        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i) - 'a']++;
        }
        for (int j = 0; j < b.length(); j++) {
            freq[b.charAt(j) - 'a']--;
        }
        for (int k = 0; k < freq.length; k++) {
            if (freq[k] != 0) {
                return false;
            }
        }
        return true;
    }
}
