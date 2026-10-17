class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        TreeMap<Integer,List<Integer>> map=new TreeMap<>();
        for(int i=0;i<n;i++){
            int s=solve(nums[i]);
            map.putIfAbsent(s,new ArrayList<>());
            map.get(s).add(i);
        }
        List<Integer> arr=new ArrayList<>();
        for(int i:map.keySet()){
            List<Integer> l=map.get(i);
            l.sort((a, b) -> Integer.compare(nums[a], nums[b]));
            for(int k=0;k<l.size();k++){
                arr.add(l.get(k));
            }
        }
        int[] pos=new int[n];
        for(int i=0;i<n;i++) pos[arr.get(i)]=i;
        int c=0;
        for(int i=0;i<n;i++){
            int ind=arr.get(i);
            int i1=pos[i];
            if(ind!=i){
                arr.set(i,i);
                arr.set(i1,ind);
                pos[i]=i;
                pos[ind]=i1;
                c++;
            }
        }
        return c;



    }
    public int solve(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;

        }
        return sum;
    }

}