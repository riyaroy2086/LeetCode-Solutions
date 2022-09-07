//https://leetcode.com/problems/maximum-length-of-repeated-subarray/submissions/

class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int res=Integer.MIN_VALUE;
        --------------------------------------------------------------------------------------------------
//      int dp[]= new int[n2];
        //using two pointers as constraints are <1k
//         for(int i=0;i<n1;i++){
//             for(int j=0;j<n2;j++){
//                 if(nums1[i]==nums2[j])
//                     dp[j]=dp[j+1]+1;  // n2 taken as the length so considering dp[j]
//                 else dp[j]=0; // TLE otherwise
                
//                 res=Math.max(res,dp[j]); // updating max
//             }
//         }
//         return res;.
        ------------------------------------------------------------------------------------------------------
        
        //using matrix
        //TC &Sc-> O(n1n2)
        int[][] dp=new int[n1+1][n2+1];
        for(int i=n1-1;i>=0;i--){
            for(int j=n2-1;j>=0;j--){
                if(nums1[i]==nums2[j])
                    dp[i][j]=dp[i+1][j+1]+1;  // n2 taken as the length so considering dp[j]
                else dp[i][j]=0; // TLE otherwise
                
                res=Math.max(res,dp[i][j]); // updating max
            }
        }
        return res;
        
    }
}
