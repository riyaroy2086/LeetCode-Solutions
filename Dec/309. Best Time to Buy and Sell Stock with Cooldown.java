// https://leetcode.com/submissions/detail/852448653/

class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices.length == 1)
            return 0;
        
        int sell =0,hold= Integer.MIN_VALUE,prev =0;
        
        for(int i: prices){
            int temp = sell;
            sell = Math.max(sell,hold+i);
            hold = Math.max(hold,prev-i);
            prev = temp;
        }
        return sell;
    }
}
