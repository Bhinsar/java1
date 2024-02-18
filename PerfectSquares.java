import java.util.Arrays;
public class PerfectSquares {
    
    public static void main(String[] args) {
        Test16  test =  new Test16();
        int n = test.numSquares(12);
        System.out.println(n);
    }
}
class Test16 {
    public int numSquares(int n) {
        
        int[] dp = new int[n + 1];
        Arrays.fill(dp, n); // 1^2 x n
        dp[0] = 0;          // no way
        dp[1] = 1;          // 1^2
        for (int i = 0; i <= n; i++) {
            System.out.println(dp[i]);
        }
        for (int i = 2; i <= n; ++i)
            for (int j = 1; j * j <= i; ++j){
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
                System.out.println(dp[i]);
            }
                
        return dp[n];
    }
}