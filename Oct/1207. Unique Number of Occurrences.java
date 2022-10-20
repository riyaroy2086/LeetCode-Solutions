// https://leetcode.com/submissions/detail/826590763/

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer,Integer> count = new HashMap<>();
        
        // putting the counts of every unique elements in the hashmap
        for(int i : arr){
           count.put(i,count.getOrDefault(i,0)+1); 
        }
        
        // traversing thru the count -> values only (not keys)
        
        Set<Integer> occ = new HashSet<>();
        for(int j : count.values()){
            if(!occ.add(j)) // if not unique so can;t include
                return false;
        }
        return true;
    }
}
