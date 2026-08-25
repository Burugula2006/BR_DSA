class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int min=Integer.MAX_VALUE;
        Integer[][] dp =new Integer[n][n];
            for(int j=0;j<n;j++){
                min=Math.min(min,f(0,j,matrix,dp));
            }
        
        return min;
    }
    public int f(int i, int j ,int[][] matrix,Integer[][] dp){
        int n=matrix.length;
        if(j<0||j>=n) return (int)1e9;
        if(i==n-1)return matrix[i][j];
        if(dp[i][j]!=null) return dp[i][j];
        int a=matrix[i][j]+f(i+1,j-1,matrix,dp);
        int b=matrix[i][j]+f(i+1,j,matrix,dp);
        int c=matrix[i][j]+f(i+1,j+1,matrix,dp);
        return dp[i][j]=Math.min(a,Math.min(b,c));
    }
}