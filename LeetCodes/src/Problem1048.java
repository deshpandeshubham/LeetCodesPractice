import java.util.*;

public class Problem1048 {
	
	public static int longestStrChain(String[] words) {
		Map<String, Integer> count = new HashMap<>();
		Map<Integer, Set<String>> map = new HashMap<>();
		for(String s: words){
			int len = s.length();
			Set<String> set =  map.getOrDefault(len, new HashSet<>());
			set.add(s);
			System.out.println(set);
			map.put(len, set);
		}
		System.out.println(map);
		int max = 0;
		for(int i = 1; i<= 16; i++){
			if(map.get(i) == null)
				continue;
			Set<String> set = map.get(i);
			System.out.println(set);
			for(String s: set){
				int sMax = 0;
				System.out.println("string : " + s);
				for(int j = 0; j<i;j++){
					System.out.println("i : " + i + " j : " + j);
					String prev = s.substring(0,j) + s.substring(j+1);
					System.out.println("Prev : " + prev);
					int currentValue = count.getOrDefault(prev, 0) + 1;
					System.out.println("CV : " + currentValue);
					if(currentValue > sMax){
						sMax = currentValue;
						count.put(s, sMax);
						System.out.println(count);
					}
				}
				max = Math.max(sMax, max);
			}
		}
		System.out.println(count);
		return max;
    }

	public static void main(String[] args) {
		String[] words = {"a","b","ba","bca","bda","bdca"};
		longestStrChain(words);
	}
}