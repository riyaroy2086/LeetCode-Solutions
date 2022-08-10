// https://leetcode.com/problems/sort-characters-by-frequency/

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> characterCount = new HashMap<>();
        for (char ch : s.toCharArray()) {
            characterCount.put(ch, characterCount.getOrDefault(ch, 0) + 1);
        }
        
        List<Character> charactersList = new ArrayList<>(characterCount.keySet());        
        Collections.sort(charactersList, (ch1, ch2) -> characterCount.get(ch2) - characterCount.get(ch1));
        
        StringBuilder result = new StringBuilder();
        for (char ch : charactersList) {
            int charCount = characterCount.get(ch);
            for (int i = 0; i < charCount; i++) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
