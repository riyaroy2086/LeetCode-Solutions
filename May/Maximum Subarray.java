class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length <= 1) return nums[0];
        
        int max=nums[0],curr=0;
        for(int i=0;i<nums.length;i++){
            if(curr<0) curr=0;
            
            curr+=nums[i];
            
            max=Math.max(max,curr);
        }return max;
    }
}