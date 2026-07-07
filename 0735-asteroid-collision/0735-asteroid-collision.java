class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> s= new Stack<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            //boolean alive=true;
            if(arr[i]>0){
             s.push(arr[i]);
           
            }
           else {

                while (!s.isEmpty() &&
                    s.peek() > 0 &&
                    s.peek() < -arr[i]) {
                    s.pop();
                }

                    if (s.isEmpty()) {
                        s.push(arr[i]);
                    }
                    else if (s.peek() == -arr[i]) {
                        s.pop();
                    }
                    else if (s.peek() < 0) {
                        s.push(arr[i]);
                    }
}
        }
        
      int[] res = new int[s.size()];

for (int i = res.length - 1; i >= 0; i--) {
    res[i] = s.pop();
}
return res;
    }
}