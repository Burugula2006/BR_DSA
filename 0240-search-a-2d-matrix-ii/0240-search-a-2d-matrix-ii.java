class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
       for(int i=0;i<m;i++){
        int l=0;
        int r=n-1;
        int arr[]=matrix[i];
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target)return true;
            else if(arr[mid]<target)l=mid+1;
            else{
                r=mid-1;
            }
        }
       }
       return false;
    }
}