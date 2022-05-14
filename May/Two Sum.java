class Solution {
    public int[] twoSum(int[] nums, int target) {
//         int n = nums.length();
        
//         for(int i = 0;i<n-1 ;i++){
//             for(int j = i+1 ; j<n;j++ ){
//                 if((nums[i] + nums[i+1]) == target)
//                 return int[i, j]
//             }
            
//         } return int[];
        
        HashMap<Integer , Integer> m = new HashMap<>();
        int n = nums.length;
        for(int i=0; i<=n-1; i++){
            if(m.containsKey(target - nums[i]))
                return new int [] {m.get(target-nums[i]), i};
            
            m.put(nums[i],i);
        }return null;
            
        
    }
}