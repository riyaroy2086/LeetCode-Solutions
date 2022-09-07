// https://leetcode.com/submissions/detail/792450834/

class Solution {
    public int lengthOfLongestSubstring(String s) {
    
        // Tc -> O(n2)
        
        int res =0;
        for(int i=0;i<s.length();i++){
            boolean ch[] = new boolean[256]; // default vals are false 
            for(int j=i;j<s.length();j++){
                if(ch[s.charAt(j)]== true)break;
                else{
                     res = Math.max(res,j-i+1);
                     ch[s.charAt(j)]=true;
                }        
            }
            ch[s.charAt(i)]=false;
        }return res;
    }
}
