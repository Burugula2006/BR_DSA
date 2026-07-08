class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c:s.toCharArray()){
        hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(char k:s.toCharArray()){
            if(hm.get(k)==1){
                return s.indexOf(k);
            }
        }
        return -1;
        
    }
}