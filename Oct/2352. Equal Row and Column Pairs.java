// https://leetcode.com/submissions/detail/817352141/

class Solution {
    public int equalPairs(int[][] grid) {
        int res =0;
        int len = grid.length;
        
        for(int i=0;i<len;i++){
             for(int j=0;j<len;j++){
                int k =0;
                for(;k<len;k++){
                    if(grid[i][k] !=grid[k][j]){
                        break;
                    }
                   
                }
                // k=0;
                 if(k==len) res++;
             }
        }
        return res;
    }
}
