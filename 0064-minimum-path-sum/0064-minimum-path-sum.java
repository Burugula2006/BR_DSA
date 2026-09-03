class Solution {
    public int minPathSum(int[][] grid) {
        int [][]dp= new int[grid.length][grid[0].length];
       for(int i[]:dp) Arrays.fill(i,-1);
       int min=Integer.MAX_VALUE;
       min=Math.min(min,f(0,0,grid,dp));
       return min;
    }
    public int f( int i, int j, int [][] grid, int[][] dp){
        if(i==grid.length-1&& j==grid[0].length-1)return grid[i][j];
        if(i>=grid.length || j>=grid[0].length)return (int) 1e9;
        if(dp[i][j]!=-1)return dp[i][j];
        int d=grid[i][j]+f(i+1,j,grid,dp);
        int r=grid[i][j]+f(i,j+1,grid,dp);
        return dp[i][j]=Math.min(d,r);
        }
}