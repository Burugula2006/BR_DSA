class Solution {
    public int largestRectangleArea(int[] a) {
        int n=a.length;
        int [] nsl=new int[n];
        Stack<Integer> s= new Stack<>();
        for(int i=0;i<n;i++){

            while(!s.isEmpty() &&  a[s.peek()]>=a[i]){
                s.pop();
            }
            if(!s.isEmpty()) nsl[i]=s.peek();
            else nsl[i]=-1;
            s.push(i);
        }
    s.clear();
        int [] nsr=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && a[s.peek()]>=a[i]){
                    s.pop();
            }
            if(!s.isEmpty()) nsr[i]=s.peek();
            else nsr[i]=n;
            s.push(i);
            
        }
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,a[i]*(nsr[i]-nsl[i]-1));
        }
        return max;
    }
}