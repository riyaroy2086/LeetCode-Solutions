// https://leetcode.com/submissions/detail/848975260/

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        long target1 = (long) target;
        
        // the resultant list of Lists
        List<List<Integer>> quad = new ArrayList<>();
        
        if(nums == null || nums.length<4) return quad;
      
        // sorting thje nums 
        Arrays.sort(nums);
        // -2 -1 0 0 1 2
        
        int n = nums.length;
        
        for(int i=0;i<n-3;i++){
            // removing duplicates in 1st traversal
            if(i>0 && nums[i] == nums[i-1]) continue;
            
            // 3 sums problem logic
            for(int j=i+1;j<n-2;j++){
                // removing duplicates in 1st traversal
                if(j!=i+1 && nums[j] == nums[j-1]) continue;
                
                // the left and right pointers 
                int lt = j+1;
                int rt = n-1;
                
                while(lt<rt){
                    long sum =(long) nums[i]+nums[j]+nums[lt]+nums[rt];
                    if(sum== target){
                         quad.add(Arrays.asList(nums[i],nums[j],nums[lt],nums[rt]));
                        

                        while(lt<rt && nums[lt]==nums[lt+1])lt++;
                        while(lt<rt && nums[rt] == nums[rt-1]) rt--;
                        lt++;
                        rt--;
                    }
                    else if(sum > target)rt--;
                    else{
                       lt++;
                    } 
                }
            }
        }
        return quad;
    }
}
