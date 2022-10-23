// https://leetcode.com/submissions/detail/828023744/

class Solution {
    public int strStr(String haystack, String needle) {
        int res =-1;
        if(haystack.contains(needle)){
           res = haystack.indexOf(needle);
        }
        return res;
    }
}
