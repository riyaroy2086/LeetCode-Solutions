// https://leetcode.com/problems/substring-with-concatenation-of-all-words/submissions/

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> indices = new ArrayList<>();
        
        if (s == null || s.isEmpty() || words == null || words.length == 0) {
            return indices;
        }

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        int wordLength = words[0].length();
        int wordArrayLength = wordLength * words.length;

        for (int i = 0; i <= s.length() - wordArrayLength; i++) {
            String current = s.substring(i, i + wordArrayLength);
            Map<String, Integer> wordMap = new HashMap<>();
            int index = 0;
            int j = 0;

            while (index < words.length) {
                String part = current.substring(j, j + wordLength);
                wordMap.put(part, wordMap.getOrDefault(part, 0) + 1);
                j += wordLength;
                index++;
            }
            if (wordCount.equals(wordMap)) {
                indices.add(i);
            }
        }
        return indices;
    }
}
