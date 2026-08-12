class Solution {
    public int countBattleships(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='X'){
                    if(i>0 && board[i-1][j]=='X') continue;
                    if(j>0 && board[i][j-1]=='X') continue;
                    ans++;
                }
            }
        }
        return ans;
    }
}    

    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<n;j++){
    //             if(board[i][j]=='X'){
    //                 int c=0;
    //                 boolean k=false;
    //                 if(i>0 && board[i-1][j]=='X'){
    //                     c++;
    //                     k=true;
    //                 }
    //                 if(j>0 && board[i][j-1]=='X'){
    //                     c++;
                        
    //                 }
    //                 if(i<m-1 && board[i+1][j]=='X'){
    //                     c++;
    //                     k=true;
    //                 }
    //                 if(j<n-1 && board[i][j+1]=='X'){
    //                     c++;
                        
    //                 }
    //                 if(c>1) continue;
    //                 if(k && dfsr(board,i,j,m,n)){
    //                     ans++;
    //                 }else if(!k && dfsc(board,i,j,m,n)){
    //                     ans++;
    //                 }
    //             }
    //         }
    //     }
    //     return ans;

    // }
    // public boolean dfsr(char[][] board,int i,int j,int m,int n){
    //     if(i<0 || j<0 || i>=m || j>=n || board[i][j]!='X') return true;
        
    //     // if(!k && (board[i-1][j]=='X' || board[i+1][j]=='X')) return false;
    //     if(j<n-1 && board[i][j+1]=='X' || j>0 && board[i][j-1]=='X') return false;
    //     board[i][j]='.';
    //     return dfsr(board,i+1,j,m,n);
    // }
    // public boolean dfsc(char[][] board,int i,int j,int m,int n){
    //     if(i<0 || j<0 || i>=m || j>=n || board[i][j]!='X') return true;
    //     // if(k && (board[i][j+1]=='X' || board[i][j-1]=='X')) return false;
    //     if(i>0 && board[i-1][j]=='X' || i<m-1 && board[i+1][j]=='X') return false;
    //     board[i][j]='.';
    //     return dfsc(board,i,j+1,m,n);
     