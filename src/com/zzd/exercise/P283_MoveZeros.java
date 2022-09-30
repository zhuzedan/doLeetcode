package com.zzd.exercise;

import java.util.Arrays;

public class P283_MoveZeros {
    public static void main(String[] args) {
        Solution solution = new P283_MoveZeros().new Solution();
        int[]  nums = {0,1,0,3,12};
        solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    class Solution {
        //自己解法
/*        public void moveZeroes(int[] nums) {
            int len =0;
            int zeroNum = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    zeroNum++;
                    continue;
                }
                nums[len] = nums[i];
                len++;
            }
            for (int i = nums.length-zeroNum; i <nums.length; i++) {
                nums[i] = 0;
            }
        }*/
        //自己解法优化
        public void moveZeroes(int[] nums) {
            int len =0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[len] = nums[i];
                    len++;
                }
            }
            for (int i = len; i <nums.length; i++) {
                nums[i] = 0;
            }
        }
    }
}
