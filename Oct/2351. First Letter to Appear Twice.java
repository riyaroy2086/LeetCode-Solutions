// https://leetcode.com/submissions/detail/817334931/

class Solution {
    public char repeatedCharacter(String s) {
        // ArrayList<Character> al = new ArrayList<>();
        // Character ans ="a";
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)==al.get(i)) ans= s.charAt(i);
        //     else al.add(s.charAt(i));
        // }
        // return ans;
        
        int[] alphabets = new int[26];
        for(char ch : s.toCharArray()){
            alphabets[ch-'a']++; // ASCII values
            if(alphabets[ch-'a']==2) return ch;
        }
        return ' ';
    }
}