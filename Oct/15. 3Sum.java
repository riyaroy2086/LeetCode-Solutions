//https://leetcode.com/submissions/detail/832168745/ https://leetcode.com/submissions/detail/832168745/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums); // -4 -1 -1 0 1 2
        
        // declaring the List of Lists
        List<List<Integer>> res = new ArrayList <>();
        
        for(int i=0;i<len;i++){
            // left and right pointers
            int left = i+1;
            int right = len-1;
            
            if(i > 0 && nums[i] == nums[i-1]) continue; // skip the duplicates
            
            while(left<right){
                if(nums[i]+nums[left]+nums[right] == 0){
                    // forming each List
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    
                    while(left < right && nums[left] == nums[left-1]) // left = i+1
                    {
                        left++;
                    }
                }else if (nums[i]+nums[left]+nums[right] > 0) 
                    right --;
                else
                    left++;
                
            }
        }
        return res;
    }
}
