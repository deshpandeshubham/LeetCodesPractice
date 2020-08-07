import java.util.*;

public class Problem1042 {

	public static int[] gardenNoAdj(int N, int[][] paths) {
		Map<Integer, List<Integer>> graph = buildGraph(N, paths);
		int[] result = new int[N + 1];
		Arrays.fill(result, -1);
		
		for (int garden = 1; garden <= N; garden++) {
			Set<Integer> chosenFlowers = new HashSet<>();

			for (int adj : graph.getOrDefault(garden, new ArrayList<>())) {
				if (result[adj] != -1)
					chosenFlowers.add(result[adj]);
			}
			result[garden] = chooseFlower(garden, chosenFlowers);
		}
		return Arrays.copyOfRange(result, 1, N + 1);
    }
	
	private static int chooseFlower(int garden, Set<Integer> chosenFlowers) {
		for (int type = 1; type <= 4; type++) 
			if (!chosenFlowers.contains(type)) 
				return type;
		return -1;
	}
	
	private static Map<Integer, List<Integer>> buildGraph(int n, int[][] paths) {
		
		Map<Integer, List<Integer>> graph = new HashMap<>();
		for (int i = 1; i <= n; i++)
			graph.put(i, new ArrayList<>());
			
		for (int[] edge : paths) {
			int from = edge[0];
			int to = edge[1];

			graph.get(from).add(to);
			graph.get(to).add(from);
		}
		return graph;
	}
	
	public static void main(String[] args) {
		int[][] paths = {{1,2},{2,3},{3,1}};
		gardenNoAdj(3, paths);
	}
}
