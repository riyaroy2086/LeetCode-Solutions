// https://leetcode.com/submissions/detail/842137073/

class Solution {
    public int uniquePaths(int m, int n) {
        // creating a dp array of size n
        int dp[] = new int[n];
        
        // filling the array of size n with 1 as each element
        Arrays.fill(dp,1);
        
        // 1D array
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                // adding up the jth value
                dp[j] += dp[j-1];
            }
        }
        return dp[n-1];
        
    }
}
