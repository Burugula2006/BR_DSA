class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> hm = new HashMap<>();
        for(String word:words){
            hm.put(word,hm.getOrDefault(word,0)+1);
        }
        ArrayList<String> al = new ArrayList<>(hm.keySet());
        Collections.sort(al,(a,b)->{
           if( !hm.get(b).equals(hm.get(a))){
            return hm.get(b)-hm.get(a);
           }
           return a.compareTo(b);
    });
        List<String> l = new ArrayList<String>();
        for(int i=0;i<k;i++){
            l.add(al.get(i));
        }
        return l;
    }
}