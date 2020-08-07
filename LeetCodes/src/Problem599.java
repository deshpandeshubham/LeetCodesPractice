import java.util.*;

public class Problem599 {
	
	public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map1 = new HashMap();
		List<String> result = new ArrayList<>();
        for(int i=0;i<list1.length;i++)
        	map1.put(list1[i], i);
		int minSum = Integer.MAX_VALUE;
		for(int i=0;i<list2.length;i++) {
			if(map1.containsKey(list2[i])) {
				int sum = i + map1.get(list2[i]);
				if(sum < minSum) {
					result.clear();
					result.add(list2[i]);
					minSum = sum;
				}
				else if(minSum == sum)
					result.add(list2[i]);
			}
		}
		return result.toArray(new String[result.size()]);
    }

	public static void main(String[] args) {
		String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] list2 = {"KFC","Burger King","Tapioca Express","Shogun"};
		findRestaurant(list1, list2);
	}
}
