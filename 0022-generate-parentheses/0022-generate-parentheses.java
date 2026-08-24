class Solution {
        ArrayList<String> al = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        solve(0,0,n,sb);
        return al;
    }
    public void solve(int open, int close,int n , StringBuilder sb){
        if(sb.length()==2*n){
            al.add(sb.toString());
            return ;
        }
        if(open<n){
            solve(open+1,close,n,sb.append("("));
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            solve(open,close+1,n,sb.append(")"));
            sb.deleteCharAt(sb.length()-1);
        }
    }
}