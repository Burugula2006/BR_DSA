class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int l=0;
        int r=0;
        for(int i :bloomDay){
            r=Math.max(i,r);
        }
        int ans=-1;
        while(l<=r){
            int mid=(r+l)/2;
            int total_boquets=f(bloomDay,mid,k);
            if(total_boquets>=m){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public int f(int[] bloomDay,int mid,int k){
        int c=0;
        int tb=0;
        for(int i:bloomDay){
            if(i<=mid){
                c++;
            }
            else{
                c=0;
            }
            if(c==k){
                tb++;
                c=0;
            }
        }
        return tb;
    }
}