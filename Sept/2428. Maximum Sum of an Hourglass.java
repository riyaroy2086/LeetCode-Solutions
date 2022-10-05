// https://leetcode.com/submissions/detail/814258817/

class Solution {
    public int maxSum(int[][] grid) {
        //dividing hourglass into sections
        int max = 0;
        
        for(int i=0;i<=grid.length-3;i++){ // -3 restricts more than one hourglass ata time
            for(int j=0;j<=grid[0].length-3;j++){
                int sum =0;
                for(int k=j;k<j+3;k++) sum +=grid[i][k];
                for(int k=j;k<j+3;k++) sum +=grid[i+2][k];
                sum +=grid[i+1][j+1];
                
                max=Math.max(sum,max);
            }
        }return max;
    }
}
