import java.util.*;

public class Problem1443 {
	static Set<Integer> visited = new HashSet<>();
	static Map<Integer, List<Integer>> edges_map = new HashMap();
	public static int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        for(int[] edge : edges) {
        	edges_map.put(edge[0], edges_map.getOrDefault(edge[0], new ArrayList<>()));
        	edges_map.put(edge[1], edges_map.getOrDefault(edge[1], new ArrayList<>()));
        	edges_map.get(edge[0]).add(edge[1]);
        	edges_map.get(edge[1]).add(edge[0]);
        }
        System.out.println(edges_map);
		return dfs(0, 0, hasApple) * 2;
    }
	
	private static int dfs(int parent, int curr, List<Boolean> hasApple) {
		int time = 0;
		visited.add(curr);
		for(int node : edges_map.get(curr)) {
			System.out.println("Node : " + node + "Curr : " + curr);
			if(!visited.contains(node)) {
				time += dfs(curr, node, hasApple);
				System.out.println("Time : " + time);
			}
		}
		if(curr != parent)
			if(hasApple.get(curr) || time > 0)
				return time + 1;
		return time;
	}

	public static void main(String[] args) {
		int[][] edges = {{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}};
		List<Boolean> hasApple = new ArrayList<>();
		hasApple.add(false);
		hasApple.add(false);
		hasApple.add(true);
		hasApple.add(false);
		hasApple.add(true);
		hasApple.add(true);
		hasApple.add(false);
		System.out.println(minTime(7, edges, hasApple));
	}
}
