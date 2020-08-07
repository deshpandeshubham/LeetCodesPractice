public class Problem1319 {
	static int[] parents;
	public static int makeConnected(int n, int[][] connections) {
		parents = new int[n];
		for(int i=0;i<n;i++)
			parents[i] = i;
		if(connections.length < n-1)
			return -1;
		for(int[] conn : connections)
			union(conn[0], conn[1]);
		int notConnected = 0;
		for(int i=0;i<n;i++)
			if(i==parents[i])
				notConnected++;
		return notConnected-1;
	}
	
	private static void union(int a, int b) {
		int parentA = find(a);
		int parentB = find(b);
		parents[parentA] = parentB;
	}
	
	private static int find(int a) {
		while(parents[a] != a)
			a = parents[a];
		return a;
	}

	public static void main(String[] args) {
		int[][] connections = {{0,1},{0,2},{0,3},{1,2},{1,3}};
		makeConnected(6, connections);
	}
}
