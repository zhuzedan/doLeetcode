package com.zzd.exercise;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

/**
 * 合并两个有序数组
 */
public class P88_MergeArray {
    public static void main(String[] args) {
        Solution solution = new P88_MergeArray().new Solution();
        int[] nums1 = {4,5,6,0,0,0};
        int[] nums2 = {2,5,6};
        solution.merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int k = 0;
            for (int i = m; i < nums1.length; i++) {
                nums1[i] = nums2[k];
                k++;
            }
            // 遍历所有的数
            for (int i = 0; i < nums1.length; i++) {
                int minIndex = i;
                // 把当前遍历的数和后面所有的数进行比较，并记录下最小的数的下标
                for (int j = i + 1; j < nums1.length; j++) {
                    if (nums1[j] < nums1[minIndex]) {
                        // 记录最小的数的下标
                        minIndex = j;
                    }
                }
                // 如果最小的数和当前遍历的下标不一致，则交换
                if (i != minIndex) {
                    int temp = nums1[i];
                    nums1[i] = nums1[minIndex];
                    nums1[minIndex] = temp;
                }
            }

        }
    }
}
