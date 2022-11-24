
// https://leetcode.com/submissions/detail/849003827/

class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        
        if(n<=1) return false;
        //Arrays.sort(nums); 
        // 1 5 5 11
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if((sum %2) != 0) return false;
        int target = sum/2;
        
        
        boolean[][] dp = new boolean[n][target+1];
        
        if(nums[0] <= target) dp[0][nums[0]] = true;
        
        for(int i=0;i<n;i++) dp[i][0] = true;
        
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(j<nums[i])
                    dp[i][j] = dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i]];
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
