class Solution {
    public int maximumSum(int[] nums) {
        //whenever there is pair concept use HashMap
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = -1;
        for(int i:nums){
            int digitSum = funcdigitSum(i);
            int totalSum = map.getOrDefault(digitSum,0);
            if(totalSum==0) 
                map.put(digitSum,i);
            else{
                map.put(digitSum,Math.max(totalSum,i));
                max = Math.max(max,totalSum+i);
            }
        }return max;
    }
    
    int funcdigitSum(int i){
        int sum =0;
        while(i>0){
            sum+=i%10;
            i/=10;
        }return sum;
    }
}