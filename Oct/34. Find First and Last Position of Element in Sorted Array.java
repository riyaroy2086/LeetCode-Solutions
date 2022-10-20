// https://leetcode.com/submissions/detail/826457920/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        // sorted so b s can be used 
        
        return new int[]{fo(nums,target),lo(nums,target)};
       
    }
    
    private int fo(int[] nums, int target){
        int l = 0,r=nums.length-1;
        int firstOcc = -1;
        while(l<=r){
            int m=l+(r-l)/2; // how to deal with mid when initialized with -1 in case to return not +nt in the array
            if(nums[m] == target){
                firstOcc = m;
                r= m-1;
            }
            
            else if(target < nums[m])
                r=m-1;
            
            else 
                l= m+1;
        }
        return firstOcc;
    } 
    
    private int lo(int[] nums, int target){
        int l = 0,r=nums.length-1;
        int lastOcc = -1;
        while(l<=r){
            int m=l+(r-l)/2; 
            if(nums[m] == target){
                lastOcc = m;
                l = m+1; 
            }
            
            else if(target < nums[m])
                r=m-1;
            
            else 
                l= m+1;
        }
        return lastOcc;
    } 
}
