class Solution {
    public int lengthOfLastWord(String s) {
        //corner cases 
        if(s == null || s.equals("")) return 0;
        
        //removed all the blank spaces from the string
        s = s.trim();
        
        int pos = s.lastIndexOf(' '); // Hello World --> index 5 in this e.g.
        if(pos < 0) return s.length(); //if single word in a string 
        else {
            String subString = s.substring(pos+1); // indexing starts from the next index after the last blank in b/w the words
            return subString.length(); // length of the last word
        }
        
        
    }
}
