//https://leetcode.com/submissions/detail/843433389/

class Solution {
    public String shortestPalindrome(String s) {
        //Stack<Integer> st = new Stack<>();
        String str = new StringBuilder(s).reverse().toString();
        
        // str == aaaceecaa
        for(int i=0;i<str.length();i++){
            if(s.startsWith(str.substring(i)))
                // if same adding them 
                return str.substring(0,i)+s;
        }
        // s== given string
        // str == added subtring
        //chars now so + op can be used
        return str+s;
    }
}
