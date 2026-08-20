class Solution {
    List<List<Integer>> l=new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n=graph.length;
        
        dfs(graph,0,n-1,new ArrayList<>());
        return l;
    }
    public void dfs(int[][] graph,int i,int n,List<Integer> l1){
        l1.add(i);
        if(i==n){
            l.add(new ArrayList<>(l1));
            l1.remove(l1.size()-1);
            return;
        } 
        for(int j=0;j<graph[i].length;j++){
            dfs(graph,graph[i][j],n,l1);  
        }
        l1.remove(l1.size()-1);
       
    }
}