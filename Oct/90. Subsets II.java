// https://leetcode.com/submissions/detail/823555339/

class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        
        // recursive func
        subsets(0,nums,temp);
        
        return res;
    }
    
    private void subsets(int idx,int[] nums, List<Integer> temp){
        // base case
        //if(idx>=nums.length){
           res.add(new ArrayList<>(temp));
//            return;
//         }
        
            
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i] == nums[i-1]){  // non repetitive
                continue;
            }
            temp.add(nums[i]);
            subsets(i+1,nums,temp);
            temp.remove(temp.size()-1);
        }
           
    }
}
