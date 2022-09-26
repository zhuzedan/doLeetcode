package com.zzd.exercise;

/**
 * @author :zzd
 * @date : 2022/9/22
 */
public class P27_RemoveElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,1};
        int val = 1;
        Solution solution = new P27_RemoveElement().new Solution();
        int len = solution.removeElement(nums, val);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }
    class Solution {
        public int removeElement(int[] nums, int val) {
            int len = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == val) {
                    continue;
                }
                nums[len] = nums[i];
                len++;
            }
            return len;
        }
    }
}
