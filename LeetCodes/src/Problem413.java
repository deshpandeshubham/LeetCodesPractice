
public class Problem413 {
	
	public static int numberOfArithmeticSlices(int[] A) {
        int sum = 0;
		int[] dp = new int[A.length];
        for(int i=2;i<A.length;i++) {
        	if(A[i] - A[i-1] == A[i-1] - A[i-2]) {
        		dp[i] = dp[i-1] + 1;
        		sum += dp[i];
        	}
        }
        return sum;
    }

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println(numberOfArithmeticSlices(arr));
	}
}
