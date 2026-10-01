class Solution {
    int c=0;
    public int totalNQueens(int n) {
        
        
        char[][] l=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(l[i],'.');
        }
        // if(solve(l1,0)){
        //     for (char[] row : l1) {
        //         l.add(new String(row));
        //     }
        //     ans.add(l);
        // }
        solve(l,0);
        return c;
    }
    public void solve(char[][] l,int n){
        if(n==l.length){
            c++;
            return;
        }
        
        for(int i=0;i<l.length;i++){
            if(safe(l,n,i)){
                l[n][i]='Q';
                solve(l,n+1);
                l[n][i]='.';
            }
        }
        return;
        
    }
    public boolean safe(char[][] l,int row,int col){
        for(int i=row;i>=0;i--){
            if(l[i][col]=='Q') return false;
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(l[i][j]=='Q') return false;
        }
        for(int i=row,j=col;i>=0 && j<l.length;i--,j++){
            if(l[i][j]=='Q') return false;
        }
        return true;
    }
}