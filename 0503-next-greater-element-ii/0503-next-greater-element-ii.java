class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int ngr[]= new int[n];
        int [] num= new int[2*n];
        for(int i=0;i<2*n;i++){
            num[i]=nums[i%n];
        }
        Stack<Integer> s= new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=nums[i%n]){
                s.pop();
            }
            if(s.isEmpty())ngr[i%n]=-1;
            else ngr[i%n]=s.peek();
            s.push(nums[i%n]);
        }
        return ngr;
        
    }
}