// https://leetcode.com/problems/repeated-dna-sequences/

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        List<String> ans = new ArrayList<>();
        
        if(s == null || s.length()<=10){
            return ans;
        }
        
        HashMap<String, Integer> temp = new HashMap<>();
        
        for(int i = 0 ; i<=s.length()-10 ; i++){
            
            String current = s.substring(i,i+10);
            temp.put(current, temp.getOrDefault(current,0)+1);
        }
		
        for(Map.Entry<String,Integer> entry : temp.entrySet()){
            
            if(entry.getValue()>=2){
                ans.add(entry.getKey());
            }
            
        } 
        return ans;
    }
}
