class Solution {
    public int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        //default pq is minheap
       for(int i:arr){
           pq.add(i);
       }
        int res=0;
        while(k-->0){
            res=pq.poll();
        }
        return res;
    }
}