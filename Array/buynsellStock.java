package Array;

class Solution {
    public int maxProfit(int[] prices) {
        //set your min price to max integer value so that any value that's initially lesser than 
        //max integer value be set as min price
        int minprice = Integer.MAX_VALUE;
        //Initially your maximum profit will be 0
        int maxprofit = 0;
        //Loop through prices
        
        for(int i=0;i<prices.length;i++){
            //check if prices[i] is less than min price
            if(prices[i] < minprice){
                //if the prices[i] is less than min price assign prices[i] to min price
                minprice = prices[i];
            //else check if prices[i] minus min price is giving you max profit    
            }else if(prices[i] - minprice > maxprofit){
                //if prices[i] - minprice gives you max profit assign prices[i] - minprice to max profit
                maxprofit = prices[i] - minprice;
            }
        }
        // return max profit as it holds the maximum profit after all the iterations
        return maxprofit;
    }
}

/* 
Time Complexity = O(n)
Space Complexity = O(1)
*/