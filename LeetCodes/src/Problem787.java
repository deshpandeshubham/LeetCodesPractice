
public class Problem787 {
	
	static int minCost = 0;
	static int[][] grid;
	static int n;
	public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        n = n;
        grid = new int[flights.length][flights[0].length];
        for(int[] flight : flights) 
        	grid[flight[0]][flight[1]] = flight[2];
        dfs(0, src, dst, K);
        return minCost;
    }
	
	private static void dfs(int currCost, int src, int dst, int k) {
		if(src == dst) 
			minCost = Math.min(minCost, currCost + grid[src][dst]);
		else if(k == 0 && grid[src][dst] > 0)
			minCost = Math.min(minCost, currCost + grid[src][dst]);
		if(k > 0) {
			for(int i=0;i<n;i++) {
				if(i != src && grid[src][i] > 0 && currCost + grid[src][i] < minCost)
					dfs(currCost + grid[src][i], i, dst, k--);
			}
		}
	}

	public static void main(String[] args) {
		int[][] flights = {{0,1,100}, {1,2,100}, {0,2,500}};
		findCheapestPrice(3, flights, 0, 2, 1);
	}
}
