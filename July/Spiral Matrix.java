class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // 450 sheet --> matrix prob -1
        // vv easy soln
        //its a pattern
        
        List<Integer> arr=new ArrayList<Integer>();
        int j=0,k=0;
        int row = matrix.length-1;
        int col = matrix[0].length-1;
        
        while(j<=row && k<=col){
            
            for(int i=k;i<=col;i++)
                arr.add(matrix[j][i]);
            
            j++;
            for(int i=j;i<=row;i++)
                arr.add(matrix[i][col]);
            
            col--;
            
            
            if(j<=row){
                for(int i=col;i>=k;i--)
                  arr.add(matrix[row][i]);
            
            row--;
            }
            if(k<=col){
                for(int i=row;i>=j;i--)
                  arr.add(matrix[i][k]);
            
            k++;
            }
        }
        return arr;
    }
}