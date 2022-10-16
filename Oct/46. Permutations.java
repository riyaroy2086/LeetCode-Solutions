// https://leetcode.com/submissions/detail/823727577/

class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        //not only subsets but also permutations
        res= new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        
        // recurive call
        sum(nums,new boolean[nums.length],temp);
        
        return res;
        
    }
    
     private void sum(int[] nums,boolean[] repeat, List<Integer> temp){
        
        //base case
        if(temp.size()== nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            //if duplicate exits continue
            //omit
            if(repeat[i]) continue;
            
            // same format
            
            repeat[i] = true;
            
            temp.add(nums[i]);
            // incrementing the loop by 1 until it  exhausts
            // total - candidates[i] logic
            sum(nums,repeat,temp);
            
            temp.remove(temp.size()-1);
            
            repeat[i] = false;
        }
        
        
    }
}
