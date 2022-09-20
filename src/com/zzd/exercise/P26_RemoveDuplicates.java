package com.zzd.exercise;

public class P26_RemoveDuplicates {
    public static void main(String[] args) {
        Solution solution = new P26_RemoveDuplicates().new Solution();


        int asd =solution.removeDuplicates(new int[] {1,1,2,3});
        System.out.println(asd);
    }
    class Solution {
        public int removeDuplicates(int[] nums) {
            int length = 0;
            for (int i = 0; i < nums.length; i++) {
                if (i == 0) continue;
                int num = nums[i];
                if (num == nums[i-1]) {
                    length++;
                }
            }
            return length;
        }
    }
}
