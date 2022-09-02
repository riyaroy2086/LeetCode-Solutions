// https://leetcode.com/problems/wiggle-sort-ii/

class Solution {
    public void wiggleSort(int[] nums) {
        int[] temp = new int[nums.length];
        Arrays.sort(nums);
        int left = (nums.length - 1) / 2, right = nums.length - 1;
        for (int i = 0; i < temp.length; i ++) {
            if (i % 2 == 0) {
                temp[i] = nums[left--];
            }
            else {
                temp[i] = nums[right--];
            }
        }
        
        System.arraycopy(temp, 0, nums, 0, temp.length);
    }
}
