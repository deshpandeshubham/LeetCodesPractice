public class Problem1020 {
	
	public static int numEnclaves(int[][] A) {
        int cnt = 0;
        for(int i=0;i<A[0].length;i++) {
        	if(A[0][i] == 1)
        		dfs(A, 0, i);
        	if(A[A.length - 1][i] == 1)
        		dfs(A, A.length - 1, i);
        }
        for(int i=0;i<A.length;i++) {
        	if(A[i][0] == 1)
        		dfs(A, i, 0);
        	if(A[i][A[0].length - 1] == 1)
        		dfs(A, i, A[0].length - 1);
        }
        for(int i=0;i<A.length;i++) 
            for(int j=0;j<A[0].length;j++) 
                if(A[i][j] == 1)
                    cnt++;
		return cnt;
    }

	private static void dfs(int[][] grid, int row, int col) {
		if(row < 0 || row > grid.length-1 || col < 0 || col > grid[0].length-1 || grid[row][col] == -1 || grid[row][col] == 0)
			return;
		grid[row][col] = -1;
		dfs(grid, row+1, col);
		dfs(grid, row, col+1);
		dfs(grid, row-1, col);
		dfs(grid, row, col-1);
	}
	
	public static void main(String[] args) {
		int[][] A = {{0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}};
		System.out.println(numEnclaves(A));
	}
}
