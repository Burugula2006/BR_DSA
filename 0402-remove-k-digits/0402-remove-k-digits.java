class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> s= new Stack<>();
        for(char c:num.toCharArray()){
            int n=c-'0';
            while(!s.isEmpty() && k>0 && s.peek()>n){
                s.pop();
                k--;
            }
            s.push(n);
        }
        while(k>0){
            s.pop();
            k--;
        }
        
       StringBuilder sb = new StringBuilder();
      for(int i: s){
        sb.append(i);
      }

       
        while( sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
            
        }
       if (sb.length() == 0){
            return "0";
       }
      return sb.toString();
       
        }
}