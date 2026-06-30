class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        List<Character> al= new ArrayList<>(hm.keySet());
        al.sort((a,b)->{
        if(a!=b) return Integer.compare(hm.get(b),hm.get(a));
        return a-b;
        });
      //  Collections.sort(hm,(a,b)->Integer.compare(hm.get(b),hm.get(a)));
        StringBuilder sb =new StringBuilder();
        for(char c:al){
            int k=hm.get(c);
            for(int i=0;i<k;i++){
            sb.append(c);
            }
        }
    return sb.toString();
    }
}