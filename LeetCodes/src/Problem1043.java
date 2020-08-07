
public class Problem1043 {
	
	public static int maxSumAfterPartitioning(int[] A, int K) {
		int[] dp = new int[A.length+1];
		for(int i=1;i<=A.length;i++) {
			int max = dp[i];
			int j = i-1;
			while((i-j <= K) && (j >= 0)) {
				max = Math.max(A[j], max);
				dp[i] = Math.max(dp[i], dp[j]+max*(i-j));
				j--;
			}
		}
		return dp[A.length];
    }

	public static void main(String[] args) {
		int[] A = {1,15,7,9,2,5,10};
		System.out.println(maxSumAfterPartitioning(A, 3));
	}
}
