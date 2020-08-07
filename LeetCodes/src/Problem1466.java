import java.util.*;

public class Problem1466 {
	
	List<Integer>[] incoming, outgoing;
    HashSet<Integer> visited;
    int ans;
	
    public int minReorder(int n, int[][] connections){
        ans = 0;
        incoming = new ArrayList[n];
        outgoing = new ArrayList[n];
        for(int i = 0; i < n; i++){
            incoming[i] = new ArrayList();
            outgoing[i] = new ArrayList();
        }
        for(int edge[] : connections){
            incoming[edge[1]].add(edge[0]);
            outgoing[edge[0]].add(edge[1]);
        }
        visited = new HashSet();
        dfs(0);
        return ans;
    }
    
    void dfs(int v){
        visited.add(v);
        for(int i : outgoing[v])
            if(!visited.contains(i)){
                ans++;
                dfs(i);
            }
        for(int i: incoming[v])
            if(!visited.contains(i))
                dfs(i);
    }

	public static void main(String[] args) {
		int[][] connections = {{0,1}, {1,3}, {2,3}, {4,5}, {4,0}};
		new Problem1466().minReorder(6, connections);
	}
}
