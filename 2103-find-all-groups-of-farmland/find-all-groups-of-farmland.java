class Solution {
    ArrayList<List<Integer>> l=new ArrayList<>();
    public int[][] findFarmland(int[][] land) {
        int m=land.length;
        int n=land[0].length;
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(land[i][j]==1){
                    bfs(land,i,j,m,n);
                }
            }
        }
        int[][] ans=new int[l.size()][4];
        int k=0;
        for(List<Integer> list:l){
            
            for (int i = 0; i < list.size(); i++) {
                ans[k][i] = list.get(i);
            }
            k++;

        }
        return ans;
    }
    public void bfs(int[][] land,int i,int j,int m,int n){
       
       ArrayList<Integer> l1=new ArrayList<>();
       l1.add(i);
       l1.add(j);
       int c=-1;
       int r=-1;
       
        for(int j1=i;j1<m;j1++){
            if(land[j1][j]==1){
                land[j1][j]=2;
            }else if(land[j1][j]==0){
                r=j1;
                break;
            }
        }
       
        for(int k1=j+1;k1<n;k1++){
            if(land[i][k1]==1){
                land[i][k1]=2;
            }else if(land[i][k1]==0){
                c=k1;
                break;
            }
        }
        if(r==-1) r=m;
       
       if(c==-1) c=n;
       
        for(int i1=i;i1<r;i1++){
            for(int j1=j;j1<c;j1++){
                land[i1][j1]=2;
            }
        }
        r--;
        c--;
       
       
       
       
       l1.add(r);
       l1.add(c);
       l.add(l1);
    }
}