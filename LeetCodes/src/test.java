import java.util.*;

public class test {
	public static void main(String[] args) {
		Map<Integer, List<Integer>> map = new HashMap();
		int[][] arr  = {{1,2,3},{4,5,6},{1,2,3},{7,8,9},{4,5,6},{1,5,7}};
		int index = 0;
		for(int[] temp : arr) {
			int sum = 0;
			for(int n : temp) 
				sum += n;
			List<Integer> tempList = map.getOrDefault(sum, new ArrayList<>());
			tempList.add(index);
			map.put(sum, tempList);
			index++;
		}
		System.out.println(map);
	}
}
