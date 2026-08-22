class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int m=isWater.length;
        int n=isWater[0].length;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(isWater[i][j]==1){
                    isWater[i][j]=0;
                    q.add(new int[]{i,j});

                }else{
                    isWater[i][j]=-1;
                }
            }
        }
        int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            int[] arr=q.poll();
            int r=arr[0];
            int c=arr[1];
            for(int[] i:dir){
                int nr=r+i[0];
                int nc=c+i[1];
                if(nr>=0 && nr<m && nc>=0 && nc<n && isWater[nr][nc]==-1){
                    q.add(new int[]{nr,nc});
                    isWater[nr][nc]=isWater[r][c]+1;
                }
            }
        }
        return isWater;
    }
}