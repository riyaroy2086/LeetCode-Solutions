class Solution {
    public int[] numberOfPairs(int[] nums) {
//         int[] ans = new int[2];
//         int ps = 0;
//         int ups = 0;
//         Map<Integer, Integer> m = new HashMap<>();
//         Arrays.sort(nums);
//         for (int i = 0; i < nums.length; i++) {
//             m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
//         }
       
//         for (int i = 0; i < nums.length; i++) {
//             if (m.get(nums[i]) > 1) {
//                 ps++;
//             }
//             if (m.get(nums[i]) % 2 == 1) {
//                 ups++;
//             }
//         }
//         ans[0] = ps;
//         ans[1] = ups;
//         return ans;
        
        // SOLUTION USING HashSet
        HashSet<Integer> hs = new HashSet<>();
        int pair =0;
        for(int i : nums){
            if(!hs.contains(i))
                hs.add(i);
            else{
                hs.remove(i);
                pair++;
            }
        }//here we need to retrurn an array
        return new int[]{pair,nums.length-(2*pair)};
 
    }
}        
        
        
        