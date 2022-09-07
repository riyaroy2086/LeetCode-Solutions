//https://leetcode.com/submissions/detail/791496214/

class Solution {
    public int maxProduct(int[] nums) {
        // TLE
        
        int res = nums[0],max=nums[0],min=nums[0];
        //initializing from nums[0] so traversing from idx 1
        for(int i=1;i<nums.length;i++){
        //     int pro= nums[i];
        //     for(int j=i+1;j<nums.length;j++){
        //         res = Math.max(pro,res);
        //         pro*=nums[j];
        //     }
        //     res = Math.max(pro,res);
            
            if(nums[i]<0){
                int temp = min;
                min=max;
                max=temp;
            }
            
            min=Math.min(nums[i],nums[i]*min);
            max=Math.max(nums[i],nums[i]*max);
            
            res = Math.max(max,res);
        }
        return res;     
    }
}
