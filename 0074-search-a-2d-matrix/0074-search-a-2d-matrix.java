class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        // int k=0;
        // int arr[]= new int[m*n];
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++)
        //     {
        //         arr[k++]=matrix[i][j];
        //     }
        // }
        // int l=0;
        // int r=m*n-1;
        // while(l<=r){
        //     int mid=l+(r-l)/2;
        //     if(arr[mid]==target)return true;
        //     else if(arr[mid]<target){
        //         l=mid+1;
        //     }
        //     else{
        //         r=mid-1;
        //     }
        // }
        // return false;
        int left=0;
        int right=m*n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int row=mid/n;
            int col=mid%n;
                if(matrix[row][col]==target)return true;
            else if(matrix[row][col]>target)right=mid-1;
            else left=mid+1;;
        }
        return false;
        
    }
}