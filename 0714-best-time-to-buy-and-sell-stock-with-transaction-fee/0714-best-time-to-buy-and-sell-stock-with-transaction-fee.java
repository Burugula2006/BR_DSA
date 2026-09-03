class Solution {
    public int maxProfit(int[] prices, int fee) {
        int[][] dp = new int[prices.length][2];
        for(int []i:dp){
            Arrays.fill(i,-1);
        }
        return f(0,prices,1,fee,dp);
    }
    public int f(int i,int [] prices, int buy, int fee, int[][]dp){
        if(i==prices.length){
            return 0;

        }
        if(dp[i][buy]!=-1)return dp[i][buy];
        if(buy==1){
            int take=-prices[i]+f(i+1,prices,0,fee,dp);
            int nt=f(i+1,prices,1,fee,dp);
            return dp[i][buy]=Math.max(take,nt);
        }
        else{
            int take=prices[i]+f(i+1,prices,1,fee,dp)-fee;
            int nt=f(i+1,prices,0,fee,dp);
            return dp[i][buy]=Math.max(take,nt);

        }
    }
}