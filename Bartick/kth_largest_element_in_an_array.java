// https://leetcode.com/problems/kth-largest-element-in-an-array/submissions/

import java.util.Arrays;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
