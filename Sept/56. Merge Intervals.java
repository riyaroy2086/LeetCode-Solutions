// https://leetcode.com/submissions/detail/804203546/ 

class Solution {
    public int[][] merge(int[][] intervals) {
        //sort or unsorted 
        // if unsorted
        //first sort the intervals
        ArrayList<int[]> al = new ArrayList<>();
        
        // edge cases
        if(intervals== null || intervals.length ==0)
            return al.toArray(new int[0][]); // the first element which is itself an array
        // now sorting in ascending order
        Arrays.sort(intervals,(x,y)-> x[0]-y[0]);
        
        //taking pointers at j[0] & j[1] of i[0] :
        int f=intervals[0][0];
        int b = intervals[0][1];
        
        //traverse now
        for(int[] i : intervals){
            if(i[0]<=b) // if inclusive
            {
               b=Math.max(b,i[1]);
            }else{     // if not inclusive
               al.add(new int[]{f,b});
               //updaing front and back
               f=i[0];
               b=i[1]; 
            } 
            
        }
        al.add(new int[]{f,b});
        return al.toArray(new int[0][]);
    }
}
