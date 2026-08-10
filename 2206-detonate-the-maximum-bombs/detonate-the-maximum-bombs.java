class Solution {
    public int maximumDetonation(int[][] bombs) {
        int n=bombs.length;
        
        int max=0;
        for(int i=0;i<n;i++){
                boolean[] visited=new boolean[n];
                int c=dfs(bombs,i,visited);
                max=Math.max(max,c);
            
        }
        return max;
    }
    public boolean is(int x1,int y1,int x2,int y2,int r1){
        long d1=x1-x2;
        long d2=y1-y2;
        return d1*d1+d2*d2<=(long)r1*r1;
    }
    public int dfs(int[][] bombs,int i,boolean[] visited){
        visited[i]=true;
        int c=1;
        for(int j=0;j<bombs.length;j++){
            if(!visited[j] && is(bombs[i][0],bombs[i][1],bombs[j][0],bombs[j][1],bombs[i][2])){
                c+= dfs(bombs,j,visited);
            }
        }
        return c;
        
    }
}