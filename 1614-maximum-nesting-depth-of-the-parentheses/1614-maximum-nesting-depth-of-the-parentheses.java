class Solution {
    public int maxDepth(String s) {
        int max=0;
        //Stack<Character> st = new Stack<>();
       int co=0;
        for(char c: s.toCharArray()){
            if(c=='('){
                co++;
                max=Math.max(co,max);
            }
            else if(c==')'){
                co--;
            }
    
        }
        return max;
    }
}