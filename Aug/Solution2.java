public class Solution2 {
    public int maxArea(int[] height) {
        // BRUTE FORCE
               //----------------------------------------------
               int i=0,n=height.length-1;
               int max_ht = Integer.MIN_VALUE;
               
               while(i<n){
                   int min_ht = Integer.min(height[i],height[n]);
                   max_ht = Integer.max(max_ht,min_ht*(n-i));
                   if(height[i] > height[n])n--;
                   else i++;
                   
               }return max_ht;
               
               //-------------------------------------------------
    }
}
