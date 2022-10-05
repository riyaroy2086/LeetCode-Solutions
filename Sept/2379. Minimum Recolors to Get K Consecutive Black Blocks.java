// https://leetcode.com/submissions/detail/815018097/

class Solution {
    public int minimumRecolors(String blocks, int k) {
        // there has to be at least one occurance of consecutive black boxes
        // if not mininmum , taking the first k boxes
        // minimum inc so count& maxcount
        int c=0,m=0;
        for(int i=0;i<blocks.length();i++){
            if(blocks.charAt(i)== 'B') c++; // simple check
            if(i>=k && blocks.charAt(i-k)=='B') c--; // check after k exceeds and hence increasing the i after k and decreasing the i-k
            m=Math.max(m,c); // updaing c;
        }
        return k-m;                                                                                                                                                         
    }
}
