class Solution {
    public boolean checkValidString(String s) {
        int x=0;
        int y=0;
        int count=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                x++;
                y++;
            }
            else if (c==')'){
                x--;
                y--;
            }
            else{
                x--;
                y++;
            }
            if(x<0)x=0;
            if(y<0)return false;
        }
        return x==0;
       
        
    }
}