class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int len=0;
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        boolean flag=false;
        for(char c:hm.keySet()){
            if(hm.get(c)%2==0){
                len+=hm.get(c);
            }else{
                len+=hm.get(c)-1;
                flag=true;
            }
        }
            if(flag)len++;
        return len;
    }
}