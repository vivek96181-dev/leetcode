class Solution {
    int[] dp;
    public int rob(int[] nums) {
        int n=nums.length;
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return Math.max(robbing(nums,0,0),robbing(nums,0,1));
    }
    public int robbing(int[] nums,int sum,int n){
        if(n>=nums.length) return 0;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=nums[n]+Math.max(robbing(nums,sum,n+2),robbing(nums,sum,n+3));
    }
}