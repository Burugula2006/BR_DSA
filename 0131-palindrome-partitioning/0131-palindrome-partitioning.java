class Solution {
        List<List<String>> al = new ArrayList<>();
    public List<List<String>> partition(String s) {
         f(0,s,new ArrayList<>());
         return al;
    }
    public void f(int i, String s,ArrayList<String> curr){
        if(i==s.length()){
            al.add(new ArrayList<>(curr));
            return ;
        }
        for(int j=i;j<s.length();j++){
            if(isP(i,j,s)){
                curr.add(s.substring(i,j+1));
                f(j+1,s,curr);
                curr.remove(curr.size()-1);
            }
        }

    }
    public boolean isP(int i, int j, String s) {

        while (i < j) {

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}