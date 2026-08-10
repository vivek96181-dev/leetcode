class Solution {
    public int findCircleNum(int[][] isConnected) {
        int m=isConnected.length;
        int n=isConnected[0].length;
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1){
                    dfs(isConnected,i,n);
                    c++;
                }
            }
        }
        return c;

    }
    public void dfs(int[][] isConnected,int i,int n){
        isConnected[i][i]=0;
        for(int j=0;j<n;j++){
            if(isConnected[i][j]==1){
                isConnected[i][j]=0;
                dfs(isConnected,j,n);
            }
        }
    }
}