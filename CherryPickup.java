public class CherryPickup {

    public static void main(String[] args) {
        int [][]grid = {{3,1,1},{2,5,1},{1,5,5},{2,1,1}};
        Test19 test = new Test19();
        int out = test.cherryPickup(grid);
        System.out.println(out);  
    }
}

class Test19 {
    public int cherryPickup(int[][] grid) {
        int dp[][][] = new int[grid.length + 2][grid[0].length + 2][grid[0].length];
        dp[0][0][grid.length - 1] = grid[0][0] + grid[0][grid.length - 1];
        for (int i = 1; i <= grid.length; i++) {
            dp[i][0][0] = dp[i-1][0][0];
            dp[0][i][0] = dp[0][i-1][0];
        }
        
        for (int x = 1; x <= grid.length; x++) {
            for (int y = 1; y <= grid[0].length; y++) {
                dp[x+1][y+1][0] += dp[x][y][0];
                dp[x+1][0][y+1] += dp[x][y][1];
            }
        }
        return dp[grid.length+1][grid[0].length+1][0];
    
    }
}