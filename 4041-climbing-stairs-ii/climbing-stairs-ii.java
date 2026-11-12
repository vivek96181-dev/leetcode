class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp=new int[n+1];
        int ans=0;
        dp[0]=0;
        
        dp[1]=costs[0]+1;
        if(n>1)
            dp[2]=Math.min(dp[1]+costs[1]+1,costs[1]+4);
        for(int i=3;i<=n;i++){
            int one=costs[i-1]+dp[i-1]+1;
            int two=costs[i-1]+dp[i-2]+4;
            int three=costs[i-1]+dp[i-3]+9;
            dp[i]=Math.min(one,two);
            dp[i]=Math.min(dp[i],three);
        }
        return dp[n];
    }
}