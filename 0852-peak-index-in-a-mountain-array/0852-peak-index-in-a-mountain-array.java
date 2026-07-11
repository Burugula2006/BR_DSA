class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
             int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Initialize with default values
        Arrays.fill(result, -1);

        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements smaller than or equal to current element
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // Top of the stack is our next greater element
            if (!stack.isEmpty()) {
                result[i] = stack.peek();
            }

            // Always push the current element onto the stack
            stack.push(arr[i]);
        }
        int ans=-1;
        for(int i=0;i<n;i++){
            if(result[i]>ans){
                ans=i;
            }
        }
        return ans+1;


       
    }
}