
public class Problem1351 {

	public static int countNegatives(int[][] grid) {
        int count = 0;      
        int row = 0;
        int col = grid[0].length - 1; 
        while(row < grid.length && col >= 0) {
            if(grid[row][col] >= 0)
                row++;
            else {
                col--;
                count += grid.length - row;
            }
        }
        return count;
    }
    
	
	public static void main(String[] args) {
		int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
		countNegatives(grid);
	}
}
