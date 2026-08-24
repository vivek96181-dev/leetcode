class Solution {
    public int maxDistance(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    grid[i][j]=0;
                    q.add(new int[]{i,j});
                }else{
                    grid[i][j]=-1;
                }
            }
        }
        int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
        int max=-1;
        while(!q.isEmpty()){
            int[] arr=q.poll();
            for(int[] i:dir){
                int r=arr[0]+i[0];
                int c=arr[1]+i[1];
                if(r>=0 && r<m && c>=0 && c<n && grid[r][c]==-1){
                    q.add(new int[]{r,c});
                    grid[r][c]=grid[arr[0]][arr[1]]+1;
                    max=Math.max(max,grid[r][c]);
                }
            }
        }
        return max;
    }
}