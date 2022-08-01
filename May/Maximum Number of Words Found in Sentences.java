class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = Integer.MIN_VALUE;
        for(String ele : sentences){
            int spaces = 1;
            
            for(int i=0;i<ele.length();i++){
                if(ele.charAt(i) == ' ')
                    spaces++;
            }
            count= Math.max(count,spaces);
        }return count;
        
    }
}