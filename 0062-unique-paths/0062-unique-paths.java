class Solution {
    public int uniquePaths(int m, int n) {
        int sm = 0;
        int sn = 0;

        int em = m-1;
        int en = n-1;

        int[][] dp = new int[m][n];

        for(int i=0; i<m; i++){
            Arrays.fill(dp[i], -1);
        }

        return findPaths(sm, sn, em, en, dp);
    }

    public int findPaths(int sm, int sn, int em, int en, int[][] dp){
        if(sm <0 || sn < 0 || sm >em || sn > en) return 0;

        if(sm==em && sn==en) return 1;

        if(dp[sm][sn]!=-1) return dp[sm][sn];

        dp[sm][sn] = findPaths(sm+1, sn, em, en, dp) + findPaths(sm, sn+1, em, en, dp);

        return dp[sm][sn];
    }
}