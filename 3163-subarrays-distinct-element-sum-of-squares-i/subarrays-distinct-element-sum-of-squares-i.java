class Solution {
    public int sumCounts(List<Integer> nums) {
        int n=nums.size();
        // int[] arr=new int[101];
        
        int c=0;
        int ans=0;
        
        for(int i=0;i<n;i++){
            HashMap<Integer,Integer> arr=new HashMap<>();
            for(int j=i;j<n;j++){
                arr.put(nums.get(j),arr.getOrDefault(nums.get(j),0)+1);
                ans+=arr.size()*arr.size();
            }
        }
        return ans;
    }
}