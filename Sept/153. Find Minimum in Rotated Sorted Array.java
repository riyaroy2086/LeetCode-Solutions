//https://leetcode.com/submissions/detail/800261026/

class Solution {
    public int findMin(int[] nums) {
        //Binary Search so TC -> O(LogN)
        // & 2 pointer concept
        // No extra space needed so SC-> O(1)
        int s = 0,l=nums.length-1;
        while(s<l){
            int mid = (s+l)/2;
            if(nums[mid]>nums[l]) s=mid+1; // reducing the search area
            else l=mid;
        }
        return nums[l]; // gives the minimum
        
    }
}
