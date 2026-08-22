class Solution {
    public int minimumRounds(int[] tasks) {
        int n=tasks.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:tasks){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int c=0;
        for(int i:map.keySet()){
            int v=map.get(i);
            if(v==1) return -1;
            else if(v==2) c++;
            else{
                c+=v/3;
                if(v%3!=0){
                    c++;
                }
            }
        }
        return c;
    }
}