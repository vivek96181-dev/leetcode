class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(climb(cost,0),climb(cost,1));

    }
    public int climb(int[] cost,int n){
        if(n>=cost.length) return 0;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=cost[n]+Math.min(climb(cost,n+1),climb(cost,n+2));
    }
}