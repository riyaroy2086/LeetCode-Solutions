//https://leetcode.com/submissions/detail/797824944/

class Solution {
    public long countVowels(String word) {
        long res =0,l=word.length();
        for(int i=0;i<l;i++)
            if("aeiou".indexOf(word.charAt(i)) != -1) // if present
                res+=(i+1)*(l-i); // TC-> O(N) and SC-> O(1)
        
        return res;
        
    }
}
