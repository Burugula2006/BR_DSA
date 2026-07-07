class Solution {
    public long subArrayRanges(int[] nums) {
        return (long)(sumSubarrayMaxs(nums)-sumSubarrayMins(nums));
    }
    public long sumSubarrayMins(int[] arr) {
        int n=arr.length;
        Stack<Integer> s= new Stack<>();
        int[] nse= new int[n];
        int[] pse= new int[n];
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]>arr[i]){
                s.pop();
            } 
            if(s.isEmpty())pse[i]=-1;
            else pse[i]=s.peek();
            s.push(i);
        }
        s.clear();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            } 
            if(s.isEmpty())nse[i]=n;
            else nse[i]=s.peek();
            s.push(i);
        }
            long total=0;
             // long mod = 1000000007;
        for(int i=0;i<n;i++){
            total=(total+((long)arr[i]*(nse[i]-i)*(i-pse[i])));
        }
        return total;
    }
    public long sumSubarrayMaxs(int[] arr) {
        int n=arr.length;
        Stack<Integer> s= new Stack<>();
        int[] nle= new int[n];
        int[] ple= new int[n];
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]<arr[i]){
                s.pop();
            } 
            if(s.isEmpty())ple[i]=-1;
            else ple[i]=s.peek();
            s.push(i);
        }
        s.clear();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            } 
            if(s.isEmpty())nle[i]=n;
            else nle[i]=s.peek();
            s.push(i);
        }
            long total=0;
              long mod = 1000000007;
        for(int i=0;i<n;i++){
            total=(total+((long)arr[i]*(nle[i]-i)*(i-ple[i])));
        }
        return total;
    }
}