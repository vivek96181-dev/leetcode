class Solution {
    
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n=numCourses;
        
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree=new int[n];
        for(int i=0;i<prerequisites.length;i++){
            int x=prerequisites[i][0];
            int y=prerequisites[i][1];
            adj.get(y).add(x);
            indegree[x]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        List<Integer> l=new ArrayList<>();
        
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
        if(l.size()!=n) return new int[]{};
        

        // int[] visited=new int[n];
        // int[] path=new int[n];
        // boolean v=dfs(adj,visited,path,prerequisites[0][1]);

        
        int[] ans=new int[n];
        for(int i=0;i<l.size();i++){
            ans[i]=l.get(i);
        }
        return ans;

    }
    // public boolean dfs(List<List<Integer>> adj,int[] visited,int[] path,int i){
    //     visited[i]=1;
    //     path[i]=1;
        
    //     for(int j:adj.get(i)){
    //         if(visited[j]==0){
    //             if(dfs(adj,visited,path,j)) return true;
    //         }else if(path[j]==1) return true;
    //     }
    //     path[i]=0;
    //     return false;
    // }
}