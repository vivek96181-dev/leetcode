class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] visited=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int k=q.poll();
            visited[k]=true;
            for(int i:rooms.get(k)){
                if(!visited[i]){
                    q.add(i);
                }
            }
        }
        for(boolean i:visited){
            if(!i){
                return false;
            }
        }
        return true;
    }
}