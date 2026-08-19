class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set set = new HashSet<>(wordDict);
        Boolean dp[] = new Boolean[s.length()+1];
        return f(0,s,set,dp);
    }
    public boolean f(int idx,String s, Set<String> set,Boolean[] dp){
        if(idx==s.length())return true;
        if(dp[idx]!=null)return dp[idx];
        for(int i=idx+1;i<=s.length();i++){
           if(set.contains(s.substring(idx,i))){

            if(f(i,s,set,dp))return dp[i]= true;
           }
        }
return dp[idx]=false;
    }
}