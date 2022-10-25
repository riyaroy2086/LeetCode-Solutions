// https://leetcode.com/submissions/detail/829914598/

class Solution {
    public List<List<String>> solveNQueens(int n) {
        // We are using Hashing to remove the extra 
        // O(N) caused due to diagonal traversing
        
        // taking a board of n*n
        char[][] b = new char[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                // filling with '.' 
                b[i][j] = '.';
            }
        }
        
        // extra arrayList for hashing
        List<List<String>> res = new ArrayList<List <String> >();
        // mainly taking a leftrow,upperdiagonal and a lowerdiagonal will curtail the extra O(N)
        int lr[] = new int[n];
        int ud[] = new int[2*n-1];
        int ld[] = new int[2*n-1];
        // recusion
        diag(0,b,res,lr,ld,ud);
        return res;
    }
    
    static void diag(int col,char[][] b,List<List<String>> res,int lr[],int ld[],int ud[]){
        if(col==b.length){
           res.add(board(b));
            return;
        }
        
        for(int row=0;row<b.length;row++){
            if(lr[row]==0 && ld[row+col]== 0 && ud[b.length-1+col-row]==0) // checking the 3 conditions  
            {
              // if any Q is not +nt previously
                // then putting Q
                b[row][col]='Q';
                lr[row] =1;
                ld[row+col]=1;
                ud[b.length-1+col-row] = 1; 
                // calling the recursion
                diag(col+1,b,res,lr,ld,ud);
                //backtracking
                // if going back to the parent
                // then unmarking the Q with . and also 1 with 0
                b[row][col]='.';
                lr[row] =0;
                ld[row+col]=0;
                ud[b.length-1+col-row] = 0; 
            }
        }
        
    }

    
    static List <String> board(char[][] b){
        List<String> res = new LinkedList < String >(); // constructing the cols only
        for(int i=0;i<b.length;i++){
            String s = new String(b[i]);
            res.add(s);
        }
        return res;  
    }
  
}
