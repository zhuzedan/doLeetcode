package com.zzd.exercise;

public class P26_RemoveDuplicates {
    public static void main(String[] args) {
        Solution solution = new P26_RemoveDuplicates().new Solution();
        int[] nums = {1,1,2,3,4};
        int[] expectedNums = {1,2,3,4};
        int k = solution.removeDuplicates(nums);


        int asd =solution.removeDuplicates(new int[] {1,1,2,3,4});
        System.out.println(asd);
    }
    class Solution {
        public int removeDuplicates(int[] nums) {
            int numLength = 0;
            for (int i = 0; i < nums.length; i++) {
                if (i == 0) continue;
                int num = nums[i];
                if (num == nums[i-1]) {
                    numLength = nums.length -1;
                }
            }
            return numLength;
        }
    }
}
