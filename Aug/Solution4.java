public class Solution4 {
    private void swap(int nums[], int i,int j){
        while(i<j){
            int temp = nums[i]; // 2 pointer concept
            nums[i]= nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
//         int start = nums[0],c=0;
//         for(int i=0;i<nums.length;i++){
//             c++;
            
//         }
        //reverse by parts
        //1st entire reverse
        // 2nd reverse 1st part and then the k cycle
        k %= nums.length;
        if(k != 0){
            swap(nums,0,nums.length-1);
            swap(nums,0,k-1);
            swap(nums,k,nums.length-1);
        }
    }
}
