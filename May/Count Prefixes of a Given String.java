class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for(String ele : words){
            if (s.startsWith(ele))
            count++;
        }
        return count;
    }
}