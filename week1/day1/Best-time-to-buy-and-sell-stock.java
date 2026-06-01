class Solution {
    
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++)
{
   int currprofit=prices[i]-min; 
   if(currprofit>profit){
    profit=currprofit;
   }
    
    if(prices[i]<min){
        min=prices[i];
    }
    }
return profit;
 
    }
}
