
public class Problem279 {
	
	public static int numSquares(int n) {
        int[] dp = new int[n+1];
        for(int i=0;i<=n;i++)
        	dp[i] = i;
        for(int i=2;i<=n;i++) {
        	int min = i;
        	for(int j=1;j*j<=i;j++) {
        		dp[i] = Math.min(dp[i], dp[i-j*j] + 1);
        	}
        }
		return dp[n];
    }

	public static void main(String[] args) {
		numSquares(12);
	}
}
