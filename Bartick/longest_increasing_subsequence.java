// https://leetcode.com/problems/longest-increasing-subsequence/

class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length==0) return 0;
        
        int[] ans = new int[nums.length];
        int size = 0;
        for (int num : nums) {
            int i = 0, j = size;
            while (i != j) {
                int m = (i + j) / 2;
                if (ans[m] < num)
                    i = m + 1;
                else
                    j = m;
            }
            ans[i] =  num;
            if (i == size) ++size;
        }   
        return size;
        
    }
}
