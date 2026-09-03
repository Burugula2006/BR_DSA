class Solution {
    public int lastStoneWeight(int[] stones) {
       PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
       for(int i:stones){
        pq.offer(i);
       }
       if(pq.size()==1)return pq.poll();
       while(!pq.isEmpty()){
       if(pq.size()==1)return pq.poll();
       int y=pq.poll();
       int x=pq.poll();
       if(x==y)continue;
       if(x!=y)pq.offer(y-x);
       }
       return 0;
    }
}