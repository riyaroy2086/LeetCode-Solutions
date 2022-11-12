// https://leetcode.com/submissions/detail/841966108/

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        
        // filling up the set
        for(int i: nums){
            s.add(i);
        }
        
        // declaring the max and then updating it
        
        int max =0;
        for(int i:nums){
            if(!s.contains(i-1)){
                // no pred
                // then reset the counter
                int curr = 1;
                while(s.contains(++i)){
                    curr++;
                    // incrementing the counter
                }
                max = Math.max(max,curr);
            }
        }
        return max;
    }
}
