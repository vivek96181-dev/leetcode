class Solution {
    public int maxSubarrayLength(int[] nums, int k) {

        int n=nums.length;
        if(n<=k) return n;
        int max=0;
        int pre=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>k){
                max=Math.max(max,i-pre);
                while(pre<=i && map.get(nums[i])>k){
                    map.put(nums[pre], map.get(nums[pre]) - 1);
                    pre++;
                }
            }
        }
        max=Math.max(max,n-pre);
        return max==0?n:max;

    }
}