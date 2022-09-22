// https://leetcode.com/submissions/detail/806070088/

class Solution {
    public int longestContinuousSubstring(String s) {
        int res =1,l=s.length(),len =1;
        for(int i=0;i<l-1;i++){
            if(s.charAt(i) == s.charAt(i+1)-1){
                res= Math.max(res,++len);
            }else{
                len =1;
            }
        }
        return res;
    }
}
