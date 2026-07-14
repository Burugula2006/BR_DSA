class Solution {
    public int splitArray(int[] nums, int k) {
        int l=0;
        int r=0;
        for(int i:nums){
            l=Math.max(l,i);
            r=r+i;
        }
        while(l<=r){
            int m=l+(r-l)/2;
            int possible=f(nums,m,k);
            if(possible<=k){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return l;
    }
    public int f(int [] nums, int mid, int k){
        int sum=0;
        int parts=1;
        for(int i: nums){
            if(sum+i>mid){
                parts++;
                sum=i;
            }
           else sum+=i;
        }
        return parts;
    }
}