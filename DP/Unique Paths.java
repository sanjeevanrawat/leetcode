class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++){
            Arrays.fill(dp[i], -1);    
        }
    
        return upaths(0, 0, m - 1, n - 1, dp);
    }
    public int upaths(int i, int j, int m, int n, int [][] dp){
        if(i == m && j == n){
            return 1;
        }
        
        if(i > m || j > n){
            return 0;
        }
        
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        
        int p1 = upaths(i + 1, j, m, n, dp);
        int p2 = upaths(i, j + 1, m, n, dp);
        
        return dp[i][j] = p1 + p2;
    }
}