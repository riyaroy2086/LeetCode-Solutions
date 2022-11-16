// https://leetcode.com/submissions/detail/844749614/

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        //StringBuilder sb = new StringBuilder().toString();
        
        // Tc and SC-> O(mn)
        int m=text1.length();
        int n=text2.length();
        
        // here taking dp length more i+1 and not i
        int[][] dp = new int[m+1][n+1];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i+1][j+1] = text1.charAt(i) == text2.charAt(j) ? dp[i][j]+1 : Math.max(dp[i+1][j], dp[i][j+1]);
            }
        }
            
        return dp[m][n];
    }
}
