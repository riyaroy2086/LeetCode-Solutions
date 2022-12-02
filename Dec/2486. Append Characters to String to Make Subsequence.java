//https://leetcode.com/submissions/detail/852812866/

class Solution {
    public int appendCharacters(String s, String t) {
        int ti = 0;
        for(char c : s.toCharArray()){
            if(c == t.charAt(ti)){
                if(++ti == t.length())
                    return 0; 
            }
        }
        return t.length()-ti;
    }
}
