// https://leetcode.com/submissions/detail/807656984/

class Solution {
    public int mostFrequentEven(int[] nums) {
        int freq[]= new int[100001]; //0 <= nums[i] <= 105
          
        
        for(int i:nums) // storing values of nums into arr freq
            freq[i]++;
        int max = 0;  
        int ans =-1;
        
        for(int i=0;i< freq.length;i++){ // In for-each-loop, we don’t have access to 
                                         // the index, so we cannot replace elements at any specific index.
                                         // In for-loop, we can replace elements at any specific index; so we use for loop
            if(i%2==0 && freq[i]>max){
                max = freq[i];
                ans = i;
            }
        }
        return ans;
    }
}
