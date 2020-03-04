
public class Problem1277 {

	public static int countSquares(int[][] matrix) {
		int n = matrix.length;
        int m = matrix[0].length;
        int sum = 0;
        int[][] dp = new int[n+1][m+1];
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= m; j++){
                if(matrix[i-1][j-1] == 0) continue;
                dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1])+1;
                sum += dp[i][j];
            }
        }
        return sum;
    }
	
	public static void main(String[] args) {
		int[][] matrix = {{0,1,1,1},{1,1,1,1},{0,1,1,1}};
		countSquares(matrix);
	}
}
