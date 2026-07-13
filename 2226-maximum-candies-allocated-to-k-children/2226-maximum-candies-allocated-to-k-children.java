class Solution {
    public int maximumCandies(int[] candies, long k) {
    //     int l=1;
    //     int r=0;
    //     for(int i:candies){
    //         r=Math.max(r,i);
    //     }
    //     int ans=0;
    //     while(l<=r){
    //         int mid=l+(r-l)/2;
    //         boolean res=f(candies,mid,k);
    //         if(res){
    //             ans=mid;
    //             l=mid+1;
    //         }
    //         else{
    //             r=mid-1;
    //         }
    //     }
    // return ans;
    // }
    // public boolean f(int [] candies,int mid ,long k){
    //     long c=0;
    //     for(int i:candies){
    //         c=c+(i/mid);
    //     }
    //     return c>=k;
    // }
    long total = 0, co = 0;
        int left = 1, right = 0, mid = 0;
        for (int count : candies) {
            total += count;
            right = Math.max(right, count);
        }
        if (total < k) return 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            co = 0;
            for (int count : candies) {
                co += count / mid;
            }
            if (co >= k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
}
}