// https://leetcode.com/problems/split-a-string-in-balanced-strings/submissions/857758888/

class Solution {
    public int balancedStringSplit(String s) {
        int res =0, count=0;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            count += c == 'L' ? 1 :-1;
            if(count == 0) res++;
        }
        return res;
    }
}
