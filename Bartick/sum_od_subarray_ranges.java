// https://leetcode.com/problems/sum-of-subarray-ranges/

class Solution {
    public long subArrayRanges(int[] nums) {
        long ans = 0;
        for(int i=0;i<nums.length;i++){
            int maxi = nums[i], mini = nums[i];
            for(int j=i+1;j<nums.length;j++){
                mini = Math.min(mini,nums[j]);
                maxi = Math.max(maxi,nums[j]);
                ans = ans + (maxi-mini);
            }
        }
        return ans;
    }
}
