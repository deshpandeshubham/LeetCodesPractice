public class Problem547 {
	
	public int findCircleNum(int[][] M) {
		int groups = 0;
		boolean[] visited = new boolean[M.length];
		for(int i=0;i<M.length;i++) {
			if(!visited[i]) {
				groups++;
				visited[i] = true;
				dfs(M, visited, i);
			}
		}
		System.out.println(groups);
		return groups;
    }

	private void dfs(int[][] M, boolean[] visited, int p) {
		for(int i=0;i<M.length;i++) {
			if(!visited[i] && M[p][i] == 1) {
				visited[i] = true;
				dfs(M, visited, i);
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] M = {{1,1,0},
		 			 {1,1,0},
		 			 {0,0,1}};
		new Problem547().findCircleNum(M);
	}
}
