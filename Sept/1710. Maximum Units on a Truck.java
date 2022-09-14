//https://leetcode.com/submissions/detail/799786057/

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        //sorting in dec order
        //traversing 
        //checking if space left in truck -> add 
        //else dont
        
        Arrays.sort(boxTypes,(x,y)->y[1]-x[1]); // sorting 2d array
        
        int max =0;
        for(int[] i: boxTypes){
            int boxNum = i[0];
            int unitNum =i[1];
            
            
            if(truckSize >= boxNum){
                //product and then updating max
                // max+= boxNum*unitNum;
                // left boxes
                max+= boxNum*unitNum;
                truckSize -= boxNum;            
            }
            else{
                //more space so taking truckSize
                max+= truckSize*unitNum;
                return max;
            } 
        }
        return max;
    }
}
