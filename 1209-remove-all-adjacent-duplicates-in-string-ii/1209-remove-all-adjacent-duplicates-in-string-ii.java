class Solution {
    public String removeDuplicates(String s, int k) {
       Stack<Character> s1= new Stack<>(); 
       Stack<Integer> s2= new Stack<>(); 
       int n=s.length();

       // if char matches prev char  -> make a count if count ==k then we pop the and char count 
       for(int i=0;i<n;i++){
        char c=s.charAt(i);
        if( !s1.isEmpty()&& c==s1.peek()){
            s2.push(s2.peek()+1);
        }
        else{
            s2.push(1);
        }
        s1.push(c);
        if(s2.peek()==k){
            for(int j=0;j<k;j++){
                s1.pop();
                s2.pop();
        }
       }
}
       StringBuilder sb = new StringBuilder();
       while(!s1.isEmpty()){
        sb.append(s1.pop());
       }
       return sb.reverse().toString();
}
}