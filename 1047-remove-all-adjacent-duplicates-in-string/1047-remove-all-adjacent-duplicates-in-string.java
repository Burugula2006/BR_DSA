class Solution {
    public String removeDuplicates(String st) {
        Stack<Character> s= new Stack<>();
        int n=st.length();
        for(int i=0;i<n;i++){
            char c=st.charAt(i);
            if(!s.isEmpty() && c==s.peek())s.pop();
            else s.push(c);
        }
        StringBuilder sb= new StringBuilder();
        while(!s.isEmpty())sb.append(s.pop());
        return sb.reverse().toString();
    }
}