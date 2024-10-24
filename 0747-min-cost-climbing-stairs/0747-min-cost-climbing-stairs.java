class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        // int[] dp = new int[n+1];
        // for(int i=0; i<=n; i++){
        //     dp[i] = -1;
        // }
        // int ans = Math.min(solve(cost, n-1, dp), solve(cost, n-2, dp));

        int ans = solve2(cost, n);
        return ans;
    }
    //tabulation
    public int solve2(int[] cost, int n){
        int[] dp = new int[n+1];

        int prev2= cost[0];
        int prev = cost[1];

        for(int i=2; i<n; i++){
          int current = cost[i] + Math.min(prev2 , prev);  
          prev2 = prev;
          prev = current;
        }

        return Math.min(prev, prev2);
    }

    //memorization
    public int solve(int[] cost, int n, int[] dp){
        if(n==0) return cost[0];
        if(n==1) return cost[1];
        if(dp[n]!=-1) return dp[n];
        dp[n] = cost[n] + Math.min(solve(cost, n-1, dp), solve(cost, n-2, dp));
        return dp[n];
    }
}