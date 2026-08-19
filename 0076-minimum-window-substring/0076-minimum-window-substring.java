class Solution {
    public String minWindow(String s, String t) {
       // s=s.toLowerCase();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c:t.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        int count=0;
        int left=0;
        int min=Integer.MAX_VALUE;
        int start=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) - 1);
                if (hm.get(c) >= 0) {
                count++;
            }
            }
           
           
            while(count==t.length()){
                 if (right - left + 1 < min) {
                    min = right - left + 1;
                    start = left;
                }
                char x=s.charAt(left);
                if (hm.containsKey(x)) {
    hm.put(x, hm.get(x) + 1);

    if (hm.get(x) > 0) {
        count--;
    }
}
               
               left++;
            }
        }
            if(min==Integer.MAX_VALUE)return "";
return s.substring(start,start+min);
    }
}