package com.zzd.exercise;

public class P349_IntersectionArrays {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            int[] num = new int[0];
            for (int i = 0; i < nums1.length; i++) {
                for (int j=0;j<nums2.length;j++) {
                    if (nums1[i] != nums2[j]){
                        continue;
                    }else {
                        num[i] = nums1[i];
                    }
                }
            }
            return num;
        }
    }
}
