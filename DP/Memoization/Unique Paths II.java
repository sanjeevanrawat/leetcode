class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length - 1;
        int n = obstacleGrid[0].length - 1;
        
        int[][] dp = new int[m + 1][n + 1];
        
        for(int i = 0; i < m + 1; i++){
            Arrays.fill(dp[i], -1);
        }
        
        return upath(0, 0, m, n, obstacleGrid, dp);
    }
    public static int upath(int i, int j, int m, int n, int[][] obstacleGrid, int[][] dp){
        if(i == m && j == n && obstacleGrid[i][j] != 1){
            return 1;
        }
        
        if(i > m || j > n || obstacleGrid[i][j] == 1){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
            
        int p1 = upath(i + 1, j, m, n, obstacleGrid, dp);
        int p2 = upath(i, j + 1, m, n, obstacleGrid, dp);
        
        return dp[i][j] = p1 + p2;
    }
}
// time complexity -> O(n);
// space complexity -> O(1);