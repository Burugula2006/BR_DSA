class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)->{
        if( (Integer.compare(Math.abs(a-x),Math.abs(b-x))!=0)){
            return  Integer.compare(Math.abs(a-x),Math.abs(b-x));
        }
    return a-b;
    });
        
 
        for(int i:arr){
            pq.add(i);
        }
        List<Integer> al= new ArrayList<>();
        while(k-->0){
            al.add(pq.poll());
        }
        Collections.sort(al);
        return al;
    }
}