class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(word.charAt(0)==board[i][j]){
                    if(dfs(i,j,0,word,board)) return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(int i, int j, int idx,String word, char[][] board){
        int m=board.length;
        int n=board[0].length;
        if(idx==word.length())return true;
        if(i<0 || j<0 ||i>=m || j>=n ||word.charAt(idx)!=board[i][j] ){ 
            return false;
        }
        char temp=board[i][j];
        board[i][j]='#';
        boolean found=dfs(i-1,j,idx+1,word,board)||dfs(i,j-1,idx+1,word,board)||dfs(i+1,j,idx+1,word,board)||dfs(i,j+1,idx+1,word,board);
        board[i][j]=temp;
        return found;
    }
}