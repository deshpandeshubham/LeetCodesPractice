import java.util.*;

public class Problem841 {

	//Naive Approach
	/*static Set<Integer> visited = new HashSet<>();
	public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
		List<Integer> firstRoom = rooms.get(0);
		for(int room : firstRoom)
			dfs(room, visited, rooms);
		System.out.println(visited);
		return visited.size() == rooms.size();
    }
	
	private static void dfs(int room, Set<Integer> visitedRooms, List<List<Integer>> rooms) {
		if(visitedRooms.contains(room))
			return;
		visitedRooms.add(room);
		List<Integer> list = rooms.get(room);
		for(int n : list)
			dfs(n, visitedRooms, rooms);
	} */
	
	//Improved Time : Using Stack
	public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
		Stack<Integer> stack = new Stack();
		stack.push(0);
		boolean[] visited = new boolean[rooms.size()];
		while(!stack.isEmpty()) {
			int room = stack.pop();
			visited[room] = true;
			List<Integer> list = rooms.get(room);
			for(int r : list) {
				if(!visited[r])
					stack.push(r);
			}
		}
		for(int i=0;i<visited.length;i++)
			if(!visited[i])
				return false;
		return true;
	}
	
	public static void main(String[] args) {
		List<List<Integer>> rooms = new ArrayList<>();
		List<Integer> temp1 = new ArrayList<>();
		temp1.add(1);
		//temp1.add(3);
		rooms.add(temp1);
		List<Integer> temp2 = new ArrayList<>();
		temp2.add(2);
		//temp2.add(0);
		//temp2.add(1);
		rooms.add(temp2);
		List<Integer> temp3 = new ArrayList<>();
		temp3.add(3);
		rooms.add(temp3);
		List<Integer> temp4 = new ArrayList<>();
		//temp4.add(0);
		rooms.add(temp4);
		System.out.println(canVisitAllRooms(rooms));
	}
}
