class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int [][] dp = new int[m][n];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
       return  f(0,0,text1,text2,dp);
    }
    public int f(int i, int j, String s1,String s2, int[][] dp){
        if(i==s1.length() || j==s2.length()){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        char c1=s1.charAt(i);
        char c2=s2.charAt(j);
        if(c1==c2){
            return dp[i][j]= 1+f(i+1,j+1,s1,s2,dp);
        }
        return dp[i][j]=Math.max(f(i+1,j,s1,s2,dp),f(i,j+1,s1,s2,dp));
    }
}