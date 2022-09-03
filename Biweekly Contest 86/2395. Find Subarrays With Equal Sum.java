class Solution {
    public boolean findSubarrays(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length-1;i++)
            arr.add(nums[i]+nums[i+1]);
        
        HashMap<Integer,Integer> m = new HashMap<>();
        for (int i = 0; i < arr.size(); i++)
        {
            if (m.containsKey(arr.get(i)))
            {
                
                m.put(arr.get(i), m.get(arr.get(i)) + 1);
                return true;
            }
            else
            {
                m.put(arr.get(i), 1);
            }
        }
        return false;
    }
}