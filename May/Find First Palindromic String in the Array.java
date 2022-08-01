class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            StringBuilder ans = new StringBuilder(words[i]);
            String s = ans.reverse().toString();
            
            if(words[i].equals(s)) 
                return words[i];        
        }
        return "";

    }
}