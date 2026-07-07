class Solution {
    public String simplifyPath(String path) {
        Stack<String> s= new Stack<>();
        String[] a= path.split("/+");
       // Stack<Character> c= new Stack<>();
        for(String i:a){
             if(i.equals("")||i.equals(".")){
                continue;
             }
            else if(i.equals("..") ){
                if(!s.isEmpty())s.pop();
            }
            else{
                s.push(i);
            }
            
        
        }
        if(s.isEmpty())return "/";
       
        
        StringBuilder sb = new StringBuilder();
        for(String x:s){
          sb.append("/").append(x);
        }
        
       return sb.toString();

    }
}