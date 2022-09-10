// https://leetcode.com/submissions/detail/795769760/

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int res=0;
        Map<Integer,Integer> m =new HashMap<>();
        
        for(int i:nums1)
            for(int j:nums2)
                m.put(i+j,m.getOrDefault(i+j,0)+1);
        
        for(int i:nums3)
            for(int j:nums4)
                if(m.containsKey(-i-j))
                    res+=m.get(-i-j);
        
        return res;
    }
}
