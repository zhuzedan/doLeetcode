package com.zzd.exercise;

public class P69_XSqrt {
    public static void main(String[] args) {
        Solution solution = new P69_XSqrt().new Solution();
        System.out.println(solution.mySqrt(4));
    }
    class Solution {
        public int mySqrt(int x) {
            if(x == 1)
                return 1;
            int min = 0;
            int max = x;
            while(max-min>1)
            {
                int m = (max+min)/2;
                if(x/m<m)
                    max = m;
                else
                    min = m;
            }
            return min;
        }
    }
}
