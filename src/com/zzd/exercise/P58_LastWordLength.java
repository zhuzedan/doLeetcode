package com.zzd.exercise;

/**
 * @author :zzd
 * @date : 2022/9/26
 */
public class P58_LastWordLength {
    public static void main(String[] args) {
        Solution solution = new P58_LastWordLength().new Solution();
        int s = solution.lengthOfLastWord("wqweq  qweq  qweq  ");
        System.out.println(s);
    }

    class Solution {
        public int lengthOfLastWord(String s) {
            char count = 0;
            for (int i = s.length()-1; i >0; i--) {
                if(s.charAt(i) == ' '){
                    if(count == 0) {continue;}
                    break;
                }
                count++;
            }
            return count;
        }
    }
}
