class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0; 
        int sell = 1;
        int sum =0;
        int max =0;
       while(sell < prices.length){
        if(prices[buy]  < prices[sell]){
            sum = prices[sell] - prices [buy];
            max = Math.max(max,sum);
        }else{
            buy = sell;
        }
        sell++;
       }
       return max;
    }
}
