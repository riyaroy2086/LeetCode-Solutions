// https://leetcode.com/submissions/detail/832611544/

class Solution {
    public int trap(int[] height) {
        //Tc -> O (N) & SC -> O(1)
        // no extra arrays are needed 
        // using pointer concept
        int len =height.length;
        int left = 0, right = len -1;
        int res=0;
        int ml = height[left], mr=height[right];
        
        while(left <right){
            if(ml<mr){
                res += ml- height[left]; // including the groove in b/w
                //updating the ml & mr
                ml = Math.max(ml,height[++left]);
            }else{
                res += mr - height[right]; // including the groove in b/w
                //updating the ml & mr
                mr  = Math.max(mr ,height[--right]);
            }
        }
        return res;
    }
}
