package com.vivek.hiike.class01.classworkqs;


/**
 * 4.Max Sum Contiguous Subarray
 * https://www.interviewbit.com/problems/max-sum-contiguous-subarray/?authuser=0
 *
 * Find the contiguous subarray within an array, A of length N which has the largest sum.
 *
 * Problem Constraints
 * 1 <= N <= 106
 * -1000 <= A[i] <= 1000
 *
 * Example Input
 * Input 1:
 * A = [1, 2, 3, 4, -10]
 * Input 2:
 * A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
 *
 *
 * Example Output
 * Output 1:
 * 10
 * Output 2:
 * 6
 *
 */
public class MaxSumContiguosSubarray {
    public static void main(String[] args) {
//        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] arr = new int[]{1, 2, 3, 4, -10};
        System.out.println(calculateMaxSumCSubArray(arr));
    }

    private static int calculateMaxSumCSubArray(int[] arr) {
        int sum = 0;
        int max_sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
            if(sum > max_sum) {
                max_sum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max_sum;
    }


}
