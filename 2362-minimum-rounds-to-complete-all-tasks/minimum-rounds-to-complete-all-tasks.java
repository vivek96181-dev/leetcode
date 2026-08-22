class Solution {
    public int minimumRounds(int[] tasks) {
        int n=tasks.length;
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i:tasks){
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        // int c=0;
        // for(int i:map.keySet()){
        //     int v=map.get(i);
        //     if(v==1) return -1;
        //     else if(v==2) c++;
        //     else{
        //         c+=v/3;
        //         if(v%3!=0){
        //             c++;
        //         }
        //     }
        // }
        // return c;
        Arrays.sort(tasks);
        int c=1;
        int ans=0;
        for(int i=1;i<n;i++){
            if(tasks[i]==tasks[i-1]) c++;
            else{
                if(c==1) return -1;
                
                    ans+=(c+2)/3;
                    c=1;
                
            }
        }
        if(c==1) return -1;
        else{
            ans+=(c+2)/3;
        }
        return ans;
    }
}