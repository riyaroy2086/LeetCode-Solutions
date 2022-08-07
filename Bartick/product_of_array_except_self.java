// https://leetcode.com/problems/product-of-array-except-self/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int helper = 1, n=nums.length;
        int[] answer = new int[n];
        Arrays.fill(answer, 1);
        
        for (int i=0; i<n; i++) {
            answer[i] = helper; 
            helper *= nums[i]; 
        }
        
        helper = 1;
        for (int i=nums.length-1; i>=0; i--) {
            answer[i] *= helper; 
            helper *= nums[i]; 
        }
        
        return answer;
    }
}
