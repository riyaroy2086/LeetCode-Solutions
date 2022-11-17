// https://leetcode.com/submissions/detail/845325295/

class Solution {
    public int minPathSum(int[][] grid) {
        // key -word -> top-left to bottom-rt
        
        // taking m & n and not m-1 & n-1
        int m = grid.length;
        int n = grid[0].length;
        
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                if(i>0 && j>0)
                    grid[i][j]+= Math.min(grid[i][j-1],grid[i-1][j]);
                else if(i>0)
                    grid[i][0]+= grid[i-1][0];
                else if(j>0)
                    grid[0][j]+= grid[0][j-1];
            
        
        return grid[m-1][n-1];
    }
}
