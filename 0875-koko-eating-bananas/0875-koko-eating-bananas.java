class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=max(piles);
        int ans=r;
        
        while(l<=r){
            int m=l+(r-l)/2;
            long th=0;
            for(int i:piles){
                th+=(i+m-1)/m;//ciel divison because if +1 in pile-> consider it as another hour
            }
            if(th<=h){
                ans=m;
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
    public int max(int [] piles){
        int m=piles[0];
        for(int i:piles){
            
            m=Math.max(m,i);
        }
       return m;
    }
}