class Solution {
    int start=0,end=0;
    public String longestPalindrome(String s) {
        int n=s.length();
       for(int i=0;i<n;i++){
        f(s,i,i);
        f(s,i,i+1);
       }
     return s.substring(start,end+1);   
        
    }
    public void f(String s, int i,int j){
        while(i>=0 &&j<s.length()&& s.charAt(i)==s.charAt(j) ){
            i--;
            j++;
        }
        if(j-i-1>end-start+1){
            start=i+1;
            end=j-1;
        }
    }
       

}