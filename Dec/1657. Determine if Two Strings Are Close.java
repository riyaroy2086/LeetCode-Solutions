// https://leetcode.com/submissions/detail/853880472/

class Solution {
    public boolean closeStrings(String word1, String word2) {
//         StringBuilder sb = new StringBuilder();
//         int i =0;
//         for(char c : word1.toCharArray()){
//             if(c == word2.chrAt(i))
                
//         }
        
        // adding the edge case of diiferent STring lengvth of word 1 and word2
        if(word1.length() != word2.length()) // string so using () with the length func
            return false;
        // using HashMap
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();
        
        // creating dummies for word1 and word 2 strings
        for(char c : word1.toCharArray()){
            m1.put(c,m1.getOrDefault(c,0)+1);       
        }
        for(char c : word2.toCharArray()){
            m2.put(c,m2.getOrDefault(c,0)+1);       
        }
        
        // excluding the different keysets then we dont have to  ount its vlaues
        if(!m1.keySet().equals(m2.keySet())) return false;
        // ArrayList to count the no of chars
        List<Integer> c1 = new ArrayList<>(m1.values());
        List<Integer> c2 = new ArrayList<>(m2.values());
        
        // sorting the counts
        Collections.sort(c1);
        Collections.sort(c2);
        // // swapping
        
        return c1.equals(c2);
    }
}
