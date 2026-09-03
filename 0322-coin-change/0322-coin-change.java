class Solution {
    public int coinChange(int[] coins, int amount) {
        int [][] dp= new int[coins.length][amount+1];
        for(int []i:dp){
            Arrays.fill(i,-1);
        }
       int res= f(0,coins,amount,dp);
       return res==1e9?-1:res;
    }
    public int f(int i, int coins[],int amount,int[][]dp){
        if(amount==0)return 0;
        if(i==coins.length)return (int)1e9;
        if(dp[i][amount]!=-1)return dp[i][amount];
        int take=(int)1e9;
        if(amount>=coins[i]){
            take=1+f(i,coins,amount-coins[i],dp);
            
        }
        int nt=f(i+1,coins,amount,dp);
        return dp[i][amount]=Math.min(nt,take);
    }
}