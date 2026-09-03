class Solution {
    public int maxProfit(int[] prices) {
        int [][] dp= new int[prices.length][2];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return f(0,prices,1,dp);
    }
    public int f(int i, int[] prices, int buy,int[][] dp){
        if(i==prices.length){
            return 0;
        }
        if(dp[i][buy]!=-1)return dp[i][buy];
        if(buy==1){
            int take=-prices[i]+f(i+1,prices,0,dp);
            int nt=f(i+1,prices,1,dp);
            return dp[i][buy]=Math.max(take,nt);
        }
        else{
            int take=prices[i]+f(i+1,prices,1,dp);
            int nt=f(i+1,prices,0,dp);
            return dp[i][buy]=Math.max(take,nt);
        }
    }
}