class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int c=0;
        for(int i:map.keySet()){
            int k=map.get(i);
            if(k>=3){
                c+=k/3;
                if(k%3!=0){
                    c++;
                }
            }else if(k==2) c++;
            else return -1;
        }
        return c;
    }
}