class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int l=0;
        int r=citations[n-1];
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            boolean res=f(citations,mid);
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
    public boolean f(int [] citations, int mid){
        int ans=0;
        int c=0;
        for(int i:citations){
            if(i>=mid){
                c++;
            }
        }
        return c>=mid;
    }
}