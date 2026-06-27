class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String T=s+s;
        if(T.contains(goal)){
            return true;
        }
        return false;
    }
}