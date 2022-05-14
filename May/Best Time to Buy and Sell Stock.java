class Solution {
    public int maxProfit(int[] prices) {
        //TLE  ----> TnT
//         int max = 0, n = prices.length;
       
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//               
               //TLE
               // if(prices[j] - prices[i] > max)
               //     max = prices[j] - prices[i];
                
//             }
//         }return max;
        
        
        int profit = 0,cp = Integer.MAX_VALUE,n = prices.length;
        
        for(int i=0;i<n;i++){
            if(cp > prices[i]) 
                cp =  prices[i];
            
            if(prices[i] - cp > profit)
                profit = prices[i] - cp;
        }return profit;
        
    }
}