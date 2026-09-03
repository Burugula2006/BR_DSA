class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
       String ans="";
        for(int i=0;i<n;i++){
            String odd=f(i,i,s);
            String even=f(i,i+1,s);

        
        if(odd.length()>ans.length()){
            ans=odd;
        }
        if(even.length()>ans.length()){
            ans=even;
        }

        }
        return ans;
    }
    public String f(int i, int j, String s){
        while(i>=0 && j <s.length () && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return s.substring(i+1,j);
    }
}