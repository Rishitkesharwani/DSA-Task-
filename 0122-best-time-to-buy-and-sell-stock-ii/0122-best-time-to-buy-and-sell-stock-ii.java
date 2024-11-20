class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxProfit=0;
        int buyPrice=prices[0];
        for(int i=1;i<n;i++){
            if(buyPrice<prices[i]){
                maxProfit+=prices[i]-buyPrice;
            }
            buyPrice=prices[i];

        }
        return maxProfit;
    }
}