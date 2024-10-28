class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return solveRec(n, dp);
    }

    public int solveRec(int n, int[] dp){
        // if(n<0) return 0;
        if(n==0) return 1;
        if(n==1) return 1;
        if(dp[n]!=-1) return dp[n];
       dp[n] =  solveRec(n-1, dp) + solveRec(n-2, dp);
       return dp[n];
    }
}