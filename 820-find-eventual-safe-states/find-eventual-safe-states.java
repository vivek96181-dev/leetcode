class Solution {
    
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        List<Integer> l=new ArrayList<>();
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree=new int[n];
        for(int i=0;i<n;i++){
            for(int j:graph[i]){
                adj.get(j).add(i);
                indegree[i]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int k=q.poll();
            l.add(k);
            for(int i=0;i<adj.get(k).size();i++){
                int num=adj.get(k).get(i);
                indegree[num]--;
                if(indegree[num]==0){
                    q.add(num);
                }
            }
        }
        Collections.sort(l);
        return l;
    }
    // public boolean dfs(int[][] graph,int[] visited,int[] path,int i){
    //     visited[i]=1;
    //     path[i]=1;
    //     for(int j=0;j<graph[i].length;j++){
    //         int k=graph[i][j];
    //         if(visited[k]==0){
    //             if(dfs(graph,visited,path,k)) return true;
    //         }else if(path[k]==1) return true;
    //     }
    //     path[i]=0;
    
    //     return false;

    // }
}