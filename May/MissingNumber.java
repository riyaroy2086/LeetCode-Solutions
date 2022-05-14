class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0 ;
        int n = nums.length;
        for(int i=1;i<=n;i++)
            sum += i - nums[i-1];
        
        return sum;
        
    }
}