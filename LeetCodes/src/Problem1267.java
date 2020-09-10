public class Problem1267 {
	
	public int countServers(int[][] grid) {
		int servers = 0;
		int[] row = new int[grid.length];
        int[] column = new int[grid[0].length];
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    row[i]++;
                    column[j]++;
                }
            }
        }
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    if(row[i] > 1 || column[j] > 1){
                        servers++;
                    }
                }
            }
        }
        return servers;
	}
	
	public static void main(String[] args) {
		int[][] grid = {{1,0},{0,1}};
		new Problem1267().countServers(grid);
	}
}
