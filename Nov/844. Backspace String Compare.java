// https://leetcode.com/submissions/detail/850218177/

class Solution {
    public boolean backspaceCompare(String s, String t) {
        //Stack<Integer> st = new Stack<>();
        //return comparison boolean 
        return backspace(s).equals(backspace(t));
    }
    
    private String backspace(String s){
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()){
            if(c != '#')
                sb.append(c);
            else
                sb.deleteCharAt(sb.length()-1); // pop the ,last two chars in the stack inc of # at first
        }
        
        // converting stack to string
        return sb.toString();
    }
}
