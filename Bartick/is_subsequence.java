// https://leetcode.com/problems/is-subsequence/

class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
            return true;

        int i=0;
        int j=0;    
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }

            j++;

            if(i==s.length())
                return true;
        }

        return false;
    }
}
