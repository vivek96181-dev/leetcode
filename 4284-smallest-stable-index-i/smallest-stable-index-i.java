class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        int[] arr=new int[n];
        
        for(int i=n-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            arr[i]=min;
        }

        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            if(max-arr[i]<=k){
                return i;
            }
        }
        return -1;

        
    }
}