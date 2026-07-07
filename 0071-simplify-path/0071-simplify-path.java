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
        Stack<String> s2= new Stack<>();
        while(!s.isEmpty()){
          s2.push(s.pop());
        }
        
        StringBuilder sb = new StringBuilder();
        while(!s2.isEmpty()){
          sb.append("/"+s2.pop());
        }
        
       return sb.toString();

    }
}