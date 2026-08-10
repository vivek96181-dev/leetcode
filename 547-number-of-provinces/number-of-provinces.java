class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] visited=new boolean[n];
        int c=0;
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(isConnected[i][j]==1){
        //             dfs(isConnected,i,n);
        //             c++;
        //         }
        //     }
        // }
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(isConnected,i,visited);
                c++;
            }
        }
        return c;

    }
    public void dfs(int[][] isConnected,int i,boolean[] visited){
        // isConnected[i][i]=0;
        // for(int j=0;j<n;j++){
        //     if(isConnected[i][j]==1){
        //         isConnected[i][j]=0;
        //         dfs(isConnected,j,n);
        //     }
        // }
        visited[i]=true;
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[i][j]==1 && !visited[j]){
                dfs(isConnected,j,visited);
            }
        }
    }
}