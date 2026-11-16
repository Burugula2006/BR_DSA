class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[]=new int[nums.length];
        int index=nums.length-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int val1=(int) nums[start]*nums[start];
            int val2=(int) nums[end]*nums[end];
            if(val2>val1){
                arr[index]=val2;
                end--;
                index--;
            }else{
                arr[index]=val1;
                start++;
                index--;
            }
        }
        return arr;
    }
}