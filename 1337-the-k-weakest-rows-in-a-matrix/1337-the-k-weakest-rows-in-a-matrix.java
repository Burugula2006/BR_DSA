class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n=mat.length;
        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->{
            if(Integer.compare(a[0],b[0])!=0){
                return Integer.compare(a[0],b[0]);
            }
            return Integer.compare(a[1],b[1]);
        });
        for(int i=0;i<n;i++){
            int scount=bs(mat[i]);
            pq.add(new int[]{scount,i});
        }
        int [] res= new int[k];
        for(int i=0;i<k;i++){
            res[i]=pq.poll()[1];
        }
        return res;
    }
    public int bs(int [] row ){
        int l=0;
        int r=row.length;
        while(l<r){
        int mid=l+(r-l)/2;
            if(row[mid]==1){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return l;
    }
}