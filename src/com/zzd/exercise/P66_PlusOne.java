package com.zzd.exercise;

import java.util.Arrays;

public class P66_PlusOne {
    public static void main(String[] args) {
        Solution solution = new P66_PlusOne().new Solution();
        int[] digits = {9,9,9,9};
        int[] result = solution.plusOne(digits);
        System.out.println(Arrays.toString(result));
    }
    class Solution {
        public int[] plusOne(int[] digits) {
            for (int i = digits.length-1; i >=0; i--) {
                if (digits[i]>=0 && digits[i]<=8) {
                    digits[i] = digits[i] +1;
                    return digits;
                }
                digits[i] = 0;
            }
            int[] newDigits = new int[digits.length+1];
            newDigits[0] = 1;

            return newDigits;
        }
    }

}
