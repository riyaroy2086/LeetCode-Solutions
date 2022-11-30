// https://leetcode.com/submissions/detail/852204272/

class Solution {
    public int maxProfit(int[] prices, int fee) {
        int sell=0,hold = Integer.MIN_VALUE;
        for(int buy : prices){
            sell = Math.max(sell,hold+buy);// higher than the prev vals
            hold = Math.max(hold,(sell-buy)-fee); // simple formula which results in the hold for the next buy
        }
        return sell;
    }
}
