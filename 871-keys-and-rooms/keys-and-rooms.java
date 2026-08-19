class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        int[] visited=new int[n];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(rooms.get(i).size()!=0){
                q.add(i);
                break;
            }
        }
        while(!q.isEmpty()){
            int k=q.poll();
            visited[k]=1;
            for(int i:rooms.get(k)){
                if(visited[i]==0){
                    q.add(i);
                }
            }
        }
        for(int i:visited){
            if(i==0){
                return false;
            }
        }
        return true;
    }
}