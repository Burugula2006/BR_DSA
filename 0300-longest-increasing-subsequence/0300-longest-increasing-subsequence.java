class Solution {
    public int lengthOfLIS(int[] nums) {
        int [][] dp = new int[nums.length][nums.length+1];
        for(int i[] :dp){
            Arrays.fill(i,-1);
        }
        return f(0,-1,nums,dp);
    }
    public int f(int i, int prev, int[] nums, int[][] dp){
        if(i==nums.length)return 0;
        if(dp[i][prev+1]!=-1)return dp[i][prev+1];
        int take=0;
        if(prev==-1|| nums[prev]<nums[i]){
            take=1+f(i+1,i,nums,dp);
        }
        int nt=f(i+1,prev,nums,dp);
        return dp[i][prev+1]=Math.max(take,nt);
    }
}