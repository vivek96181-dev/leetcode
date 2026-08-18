class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=-1;
        int n=nums.length;

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            max=Math.max(max,i);
        }
        if(k==n) return max;
        else if(k==1){
            int ans=-1;
            for(int i:map.keySet()){
                if(map.get(i)==1){
                    ans=Math.max(ans,i);
                }
            }
            return ans;
        }else{
            if(map.get(nums[0])>1 && map.get(nums[n-1])==1) return nums[n-1];
            else if(map.get(nums[0])==1 && map.get(nums[n-1])>1) return nums[0];
            else if(map.get(nums[0])==1 && map.get(nums[n-1])==1) return Math.max(nums[0],nums[n-1]);
        }
        return -1;

    }
}