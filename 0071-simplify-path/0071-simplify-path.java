class Solution {
    public String simplifyPath(String path) {
        Stack<String> s= new Stack<>();
        String[] a= path.replaceAll("^/+|/+$", "").split("/+");
       // Stack<Character> c= new Stack<>();
        for(String i:a){
            if(i.equals("..") ){
                if(!s.isEmpty())s.pop();
                
              
               
            }
            else if(i.equals("")||i.equals(".")){
                continue;
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