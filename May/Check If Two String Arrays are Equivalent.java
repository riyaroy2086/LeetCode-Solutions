class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // Taking empty strings
        String s1 ="";
        String s2 ="";
        // Storing word1 elements into s1
        for(String str : word1)
        {
            s1+=str;
        }
        for(String str : word2)
        {
            s2+=str;
        }
        // string to charArray to traverse every element
        char[] w1 = s1.toCharArray();
        char[] w2 = s2.toCharArray();
        // an amazing function that cheks if arrays are equal or not
        return Arrays.equals(w1,w2);
        
    }
}