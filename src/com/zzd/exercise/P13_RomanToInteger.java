package com.zzd.exercise;

import sun.security.util.Length;

/**
 * @author :zzd
 * @date : 2022/9/17
 */
public class P13_RomanToInteger {
    public static void main(String[] args) {

        Solution solution = new P13_RomanToInteger().new Solution();
        System.out.println(solution.romanToInt("LVIII"));


    }
    class Solution {
        public int romanToInt(String s) {
            int num = 0;
            int[] nums = new int[s.length()];
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                switch (ch) {
                    case('I'):
                        num = 1;break;
                    case 'M':
                        num = 1000;
                        break;
                    case 'D':
                        num = 500;
                        break;
                    case 'C':
                        num = 100;
                        break;
                    case 'L':
                        num = 50;
                        break;
                    case 'X':
                        num = 10;
                        break;
                    case 'V':
                        num = 5;
                        break;
                }
                nums[i] = num;
            }
            int rtn = 0;
            for (int i = 0; i < nums.length; i++) {
                if (i < nums.length - 1 && nums[i] < nums[i+1]) {
                    nums[i] = - nums[i];
                }
                rtn += nums[i];
            }
            return rtn;
        }
    }

}


