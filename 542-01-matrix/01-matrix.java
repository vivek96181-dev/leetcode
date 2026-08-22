class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    q.add(new int[]{i,j});
                }else{
                    mat[i][j]=m*n;
                }
            }
        }
        int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            int[] arr=q.poll();
            for(int[] i:dir){
                int r=arr[0]+i[0];
                int c=arr[1]+i[1];
                if(r>=0 && c>=0 && r<m && c<n && mat[r][c]>mat[arr[0]][arr[1]]){
                    q.add(new int[]{r,c});
                    mat[r][c]=mat[arr[0]][arr[1]]+1;
                }
            }
            

        }
        return mat;
    }
}
