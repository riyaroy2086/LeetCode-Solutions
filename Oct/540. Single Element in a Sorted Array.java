//https://leetcode.com/submissions/detail/826009939/

class Solution {
    public int singleNonDuplicate(int[] nums) {
       // int sum=0
       // for(int i:nums){
       //     sum+=nums[i];
       // }
        
        // Using Binary Search 
        // TC -> O(log N)
        
        int l = 0, r = nums.length-2;
        while(l <= r){
            int m = (l+r)/2;
            
            // if the nums.length is odd
            if(m % 2 == 0){
                if(nums[m] != nums[m+1])
                    r=m-1;
                else 
                    l=m+1;
            }else{
                if(nums[m] != nums[m+1])
                    l=m+1;
                else 
                    r=m-1;
            }
            
        }
        return nums[l];
    }
}
