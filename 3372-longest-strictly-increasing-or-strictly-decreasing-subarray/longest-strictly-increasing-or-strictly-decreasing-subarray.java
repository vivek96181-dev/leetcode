class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        int l=0,g=0;
        int ans=1;
        for(int i=1;i<n;i++){
            if(nums[i]<=nums[i-1]){
                ans=Math.max(ans,i-g);
                g=i;
            }
            if(nums[i]>=nums[i-1]){
                ans=Math.max(ans,i-l);
                l=i;
            }
        }
        if(n>1 && nums[n-1]<nums[n-2]){
            ans=Math.max(ans,n-l);
            
        }
        if(n>1 && nums[n-1]>nums[n-2]){
            ans=Math.max(ans,n-g);
            
        }
        return ans;
    }
}