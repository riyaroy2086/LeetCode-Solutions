// https://leetcode.com/submissions/detail/803712317/

class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        
        
       
//         int mn = Integer.MAX_VALUE;
//         int mx = Integer.MIN_VALUE;
         int c=0,left =-1,rt=-1;

//         for(in i=0;i<intervals.length;i++){
//             for(int j=0;j<intervals[0].length;j++){
//                 //update min and max
//                 mn = Math.min(mn,j[0]);
//                 mx = Math.max(mx,j[1]);
//             }
//         }
        
        // Arrays.sort(intervals);
        // Sorting 2D arrays
        Arrays.sort(intervals,(x,y)-> (x[0]!= y[0])? -y[0]+ x[0] : y[1]-x[1] );
        // for(int i=0;i<intervals.length;i++){
        //     for(int[] j=0;j<2;j++){
        for(int j[]: intervals){
                if(j[0]>left && j[1]>rt)
                {
                    left=j[0]; //updating the lower limit
                    c++;                 
                }             
                //updating upper limit
                rt = Math.max(rt,j[1]);        
            //}
        }
        return c;
    }
}
