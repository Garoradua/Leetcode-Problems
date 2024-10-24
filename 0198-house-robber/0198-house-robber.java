class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        for(int i=0; i<n; i++){
            dp[i] = -1;
        }
        return solveRec(nums, n, dp);
    }

    public int solveRec(int[] nums, int n, int[] dp){
        int prev = nums[0];
        int prev2  = 0 ;

        for(int i=1; i<n; i++){
            int inc = nums[i] + prev2;
            int exc = 0 + prev;
            prev2 = prev;
            prev = Math.max(inc, exc);
        }

        return prev;

        // if(n<0) return 0;
        // if(dp[n]!=-1) return dp[n];
        // int include = nums[n] + solveRec(nums, n-2, dp);
        // int exculde = 0 + solveRec(nums, n-1, dp);
        // dp[n] = Math.max(include, exculde);

    }
}