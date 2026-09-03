class Solution {
    public int rob(int[] nums) {
        int n=nums.length; 
        if(n==1)return nums[0];
        int [][] dp = new int[nums.length][n];
       for(int []i:dp) Arrays.fill(i,-1);
        return Math.max(f(0,n-2,nums,dp),f(1,n-1,nums,dp));
    }
    public int f(int i , int end, int[] nums,int[][]dp){
        if(i>end){
            return 0;
        }
        if(dp[i][end]!=-1)return dp[i][end];
        int take=nums[i]+f(i+2,end,nums,dp);
        int nt=f(i+1,end,nums,dp);

        return dp[i][end]=Math.max(take,nt);
    }
}