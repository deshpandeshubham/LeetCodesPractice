
public class Problem64 {
	
	public int minPathSum(int[][] grid) {
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				if(i == 0 && j == 0)
					continue;
				else if(i == 0) 
					grid[i][j] += grid[i][j-1];
				else if(j == 0)
					grid[i][j] += grid[i-1][j];
				else {
					int leftSum = grid[i][j] + grid[i][j-1];
					int upSum = grid[i][j] + grid[i-1][j];
					grid[i][j] = Math.min(leftSum, upSum);
				}
			}
		}
		return grid[grid.length-1][grid[0].length-1];
    }
	
	public static void main(String[] args) {
		int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
		System.out.println(new Problem64().minPathSum(grid));
	}
}
