package com.zzd.exercise;

import java.util.Arrays;

/**
 * @apiNote 丢失的数字
 * @author zzd
 * @date 2023-06-08 15:31  
 */
public class P268_MissingNumber {
    /**
     * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
     * 输入：nums = [3,0,1]
     * 输出：2
     * 解释：n = 3，因为有 3 个数字，所以所有的数字都在范围 [0,3] 内。2 是丢失的数字，因为它没有出现在 nums 中。
     */
    public int missingNumber(int[] nums) {
        int[] sortNum = new int[nums.length + 1];
        for (int num : nums) {
            sortNum[num] = num;
        }
        int result = 0;
        for (int i = 0; i < sortNum.length; i++) {
            if (sortNum[i] == 0) {
                result = i;
            }
        }
        return result;
    }

    public int missingNumberByLeetCode(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        P268_MissingNumber test = new P268_MissingNumber();
        int result = test.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1});
        // System.out.println(result);
        int resultByLeetCode = test.missingNumberByLeetCode(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1});
        System.out.println(resultByLeetCode);
    }
}
