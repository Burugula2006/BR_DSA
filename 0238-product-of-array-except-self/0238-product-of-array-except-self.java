class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        // int n=nums.length;
        
    
        //  int res[]= new int[n];
        //  res[0]=1;
        // for(int i=1;i<n;i++){
        //     res[i]=res[i-1]*nums[i-1];
        // }
        // int rp=1;
        // for(int i=n-1;i>=0;i--){
        //     res[i]=res[i]*rp;
        //     rp*=nums[i];
        // }
        
        // return res;
        int n= nums.length;
        int zc=0;
    int idx=0;
    int tp=1;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zc++;
                idx=i;
            }
            else tp*=nums[i];
        }
        int [] res= new int[n];
        if(zc>1)return res;
        for(int i=0;i<n;i++){
        if(zc==0){
            res[i]=tp/nums[i];
        }
        else if(zc==1){
            res[idx]=tp;
        }
        }
        return res;
    }
}