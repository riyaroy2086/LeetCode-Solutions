//https://leetcode.com/submissions/detail/825933773/

class Solution {
    public int search(int[] nums, int target) {
        int last = nums.length-1,fst =0;
        while(fst<=last){
            int mid = (fst+last)/2;
            if(nums[mid] == target) return mid;
            
            if(nums[fst] <= nums[mid]){
                // from fst to mid part :---------------------------
                if(nums[fst] <= target && target < nums[mid]) 
                   last = mid-1; // hence shortening the length by 1/4th
                else 
                    fst = mid+1;    
                
            }else{
                  // from mid to last part :---------------------------
                if(nums[mid] < target && target <= nums[last]) 
                    fst = mid+1;
                    // hence shortening the length by 1/4th
                else 
                    last = mid-1; 
                       
                 
            }
           
        }
        
        //else if not +nt then 
        return -1;
    }
}
