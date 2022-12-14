// https://leetcode.com/problems/maximal-square/submissions/859887172/

class Solution {
    public int maximalSquare(char[][] matrix) {
        // dp sum 
        // traversing all the four sides to determine
        int m = matrix.length;
        int n= matrix[0].length;
        // new dp array
        int dp[][] = new int[m][n];
        int maxLen = 0,prev = 0 ;

        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
                // if rows or col == 0th index
                if(i==0||j==0||matrix[i][j]=='0')
                    dp[i][j] = matrix[i][j] == '1' ? 1:0;
                else
                    dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;

                maxLen = Math.max(maxLen,dp[i][j]);   
            }
            return maxLen*maxLen;    
    }
}
