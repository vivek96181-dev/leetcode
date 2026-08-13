class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n=numCourses;
        int n1=prerequisites.length;
        
        int[][] arr=new int[n][n];
        for(int i=0;i<n1;i++){
            int x=prerequisites[i][0];
            int y=prerequisites[i][1];
            
            arr[y][x]=1;


        }
        int[] visited=new int[n];
        int[] path=new int[n];
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                if(dfs(arr,i,path,visited)) return false;
            }
        }
        return true;
    }
    public boolean dfs(int[][] arr,int i,int[] path,int[] visited){
        
        visited[i]=1;
        path[i]=1;
        for(int j=0;j<arr.length;j++){
            if(arr[i][j]==1){
                if(visited[j]==0){
                if(dfs(arr,j,path,visited)) return true;
            }else if(path[j]==1) return true;
            }
            
        }
        path[i]=0;
        return false;
    }
}