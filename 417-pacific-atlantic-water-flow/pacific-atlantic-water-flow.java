class Solution {
    List<List<Integer>> l=new ArrayList<>();
    
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;
        boolean[][] pacific=new boolean[m][n];
        for(int i=0;i<n;i++){
                if(!pacific[0][i])
                    dfs(heights,0,i,-1,-1,m,n,pacific);
            
        }
        for(int i=0;i<m;i++){
                if(!pacific[i][0])
                    dfs(heights,i,0,-1,-1,m,n,pacific);
            
        }
        boolean[][] atlantic=new boolean[m][n];
        for(int i=0;i<n;i++){
           
                if(!atlantic[m-1][i])
                    dfs(heights,m-1,i,-1,-1,m,n,atlantic);
            
        }
        for(int i=0;i<m;i++){
                if(!atlantic[i][n-1])
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

    
}