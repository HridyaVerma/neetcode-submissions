class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int maxProfit=0;

        for(int n:prices)
        {
            if(n< buy)
            {
                buy=n;
            }
            else if(n - buy > maxProfit)
            {
                maxProfit = n - buy;
            }
        }

        return maxProfit;
        
    }
}

