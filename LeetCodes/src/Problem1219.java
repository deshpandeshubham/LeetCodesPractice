public class Problem1219 {
	
	static int maxGold;
	public static int getMaximumGold(int[][] grid) {
        int row=0, col=0;
        for(int i=0;i<grid.length;i++)
        	for(int j=0;j<grid[0].length;j++)
        		 dfs(grid, 0, row, col);
        return maxGold;
    }
	
	private static void dfs(int[][] grid, int gold, int row, int col) {
		if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == 0 || grid[row][col] == -1)
			return;
		gold += grid[row][col];
		int temp = grid[row][col];
		grid[row][col] = -1;
		maxGold = Math.max(maxGold, gold);
		dfs(grid, gold, row+1, col);
		dfs(grid, gold, row, col+1);
		dfs(grid, gold, row-1, col);
		dfs(grid, gold, row, col-1);
		grid[row][col] = temp;
	}

	public static void main(String[] args) {
		int[][] grid = {{0,6,0},{5,8,7},{0,9,0}};
		System.out.println(getMaximumGold(grid));
	}
}
