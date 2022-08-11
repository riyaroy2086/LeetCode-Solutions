// https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves/

class Solution {
    public int minDifference(int[] nums) {
        if(nums.length<=4) return 0;
        Arrays.sort(nums);
        int n = nums.length;
        int op1 = nums[n-4]-nums[0];
        int op2 = nums[n-3]-nums[1];
        int op3 = nums[n-2]-nums[2];
        int op4 = nums[n-1]-nums[3];
        
        return Math.min(op1, Math.min(op2, Math.min(op3, op4)));
    }
}
