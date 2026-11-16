class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int start=0;
        int next=start+1;
        while(next<n){
            if(nums[start]!=nums[next]){
                int temp=nums[start+1];
                nums[start+1]=nums[next];
                nums[next]=temp;
                start++;
            }
            next++;
        }
        return start+1;
    }
}