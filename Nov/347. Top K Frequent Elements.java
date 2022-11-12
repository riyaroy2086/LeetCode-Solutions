// https://leetcode.com/submissions/detail/841951491/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Arrays.sort(nums);
        // int count =0;
        // List<Integer> res = new ArrayList<>();
        // for(int i=0;i<nums.length-1;i++){
        //     if(res.get(i)== nums[i]) {
        //         count++;
        //         continue;
        //         if(count >= k){
        //           res.add(nums[i]);  
        //         }   
        //     }
        // }
        // return res;
        
        // Tc -> O(NlogN)
        // bcoz adding n elements in Heap
        Map<Integer,Integer> m = new HashMap<>(); //map for storing the freq of the elements
        for(int i : nums){
            m.put(i,m.getOrDefault(i,0) + 1);
        }
        
       // max heap
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b) -> (b[1]-a[1]));
        
        // putting the key value pairs into the pq
        for(Map.Entry<Integer,Integer> entry :m.entrySet()){
            pq.offer(new int[]{entry.getKey(),entry.getValue()});
        }
        
        int res[]= new int[k];
        
        while(k>0)
        {
            res[k-1] = pq.poll()[0]; // pulling the the elments with the topmost frequencies
            k--;    
        }
        
        return res;
    }
}
