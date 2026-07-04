class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int max=0;
        int [] hist= new int[m];
        for(int k=0 ;k<n;k++){
         //   int j=0;
                int c=0;
            for(int j=0;j<m;j++){
                if(matrix[k][j]=='1'){
                    hist[j]+=1;
                }
                else{
                    hist[j]=0;
                }
                
            }
        
        int [] nsr=new int[m];
        int [] nsl= new int[m];
        Stack<Integer> s= new Stack<>();
        for(int i=0;i<m;i++){
            while(!s.isEmpty() && hist[s.peek()]>=hist[i])s.pop();
            nsl[i]=s.isEmpty()?-1:s.peek();
            s.push(i);
        }

        s.clear();

        for(int i=m-1;i>=0;i--){
            while(!s.isEmpty() && hist[s.peek()]>=hist[i])s.pop();
            nsr[i]=s.isEmpty()?m:s.peek();
            s.push(i);
        }

        
        for(int i=0;i<m;i++){
            max=Math.max(max,hist[i]*(nsr[i]-nsl[i]-1));
        }
    }
        return max;
    }
}