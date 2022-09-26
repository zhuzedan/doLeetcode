package com.zzd.exercise;

/**
 * @author :zzd
 * @date : 2022/9/18
 */
public class P14_LongestCommonPrefix {
    public static void main(String[] args) {
        Solution solution = new P14_LongestCommonPrefix().new Solution();
        System.out.println(solution.longestCommonPrefix(new String[]{"flower","fla","flab"}));

    }
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            String selectOne = "";
            if (strs.length == 0) {
                return "";
            }
            String s = strs[0];
            for (String string:strs){
                while (!string.startsWith(s)) {
                    if (s.length() == 0) {
                        return "";
                    }
                    s = s.substring(0,s.length()-1);
                }
            }
            return s;
        }
    }
}
