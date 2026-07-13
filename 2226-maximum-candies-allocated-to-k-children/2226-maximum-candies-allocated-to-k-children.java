class Solution {
    public int maximumCandies(int[] candies, long k) {
        int l=1;
        int r=0;
        for(int i:candies){
            r=Math.max(r,i);
        }
        int ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            boolean res=f(candies,mid,k);
            if(res){
                ans=mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
    return ans;
    }
    public boolean f(int [] candies,int mid ,long k){
        long c=0;
        for(int i:candies){
            c=c+(i/mid);
        }
        return c>=k;
    }
}