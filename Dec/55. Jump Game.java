// https://leetcode.com/submissions/detail/853466382/

class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length, i=0;
        for(int reach=0 ;i<n && i<= reach;i++){
            reach = Math.max(reach,nums[i]+i);
        }
        if(nums.length == i) return true;
        else return false;
    }
}