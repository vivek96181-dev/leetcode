class Solution {
    List<List<Integer>> l=new ArrayList<>();
    
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;
        boolean[][] pacific=new boolean[m][n];
        for(int i=0;i<n;i++){
                
                dfs(heights,0,i,-1,-1,m,n,pacific);
            
        }
        for(int i=0;i<m;i++){
                
                dfs(heights,i,0,-1,-1,m,n,pacific);
            
        }
        boolean[][] atlantic=new boolean[m][n];
        for(int i=0;i<n;i++){
           
                
                dfs(heights,m-1,i,-1,-1,m,n,atlantic);
            
        }
        for(int i=0;i<m;i++){
            
                
                dfs(heights,i,n-1,-1,-1,m,n,atlantic);
            
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    l.add(new ArrayList<>(Arrays.asList(i,j)));
                }
            }
        }
        return l;

    }
    public void dfs(int[][] heights,int i,int j,int p,int p1,int m,int n,boolean[][] arr){
        if(i<0 || j<0 || i>=m || j>=n || arr[i][j]) return;
        if(p!=-1 && p1!=-1 && heights[i][j]<heights[p][p1]) return;
        arr[i][j]=true;
        dfs(heights,i-1,j,i,j,m,n,arr);
        dfs(heights,i+1,j,i,j,m,n,arr);
        dfs(heights,i,j-1,i,j,m,n,arr);
        dfs(heights,i,j+1,i,j,m,n,arr);

    }

    // public boolean dfs(int[][] heights,int i,int j,int p,int p1,int m,int n,boolean[][] visited){
    //     if(i==-1 || j==-1) return true;
    //     if(i==m || j==n){
    //         is=true;
    //         return false;
    //     }
    //     if(visited[i][j]) return false;
    //     if(p!=-2 && p1!=-2 && heights[i][j]>heights[p][p1]) return false;
    //     visited[i][j]=true;
        
        
    //        boolean r1=dfs(heights,i-1,j,i,j,m,n,visited);
                 
        
    //        boolean r2=dfs(heights,i+1,j,i,j,m,n,visited);
         
     
    //        boolean c1=dfs(heights,i,j-1,i,j,m,n,visited);
         
        
    //        boolean c2=dfs(heights,i,j+1,i,j,m,n,visited);
        
    //     visited[i][j]=false;
        
    //     return  r1||r2||c1||c2;
    // }
    // public boolean dfs1(int[][] heights,int i,int j,int p,int p1,int m,int n,boolean is){
    //     if(i==m || j==n){
            
    //         return true;
    //     }
    //     if(i==-1 || j==-1) return false;
        
    //     if(p!=-1 && p!=-1 && heights[i][j]>heights[p][p1]) return false;
    //     boolean r1=false;
    //     boolean r2=false; 
    //     boolean c1=false; 
    //     boolean c2=false;
    //     if(i-1!=p && j!=p1){
    //         r1=dfs(heights,i-1,j,i,j,m,n,is);
    //     } 
    //     if(i+1!=p && j!=p1){
    //         r2=dfs(heights,i+1,j,i,j,m,n,is);
    //     } 
    //     if(i!=p && j-1!=p1){
    //         c1=dfs(heights,i,j-1,i,j,m,n,is);
    //     } 
    //     if(i!=p && j+1!=p1){
    //         c2=dfs(heights,i,j+1,i,j,m,n,is);
    //     } 
    //     return  r1||r2||c1||c2;
    // }
}