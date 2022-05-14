class Solution {
    public int removeDuplicates(int[] nums) {
        int size = 1;
        if(nums.length == 0) return 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] != nums[i]){
               nums[size] = nums[i];
                size++;
            }
        }return size;
    }
}