import java.util.*;
import java.util.Map.Entry;

public class Problem347 {
	
	public static int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> count = new HashMap();
        for (int n: nums) {
          count.put(n, count.getOrDefault(n, 0) + 1);
        }
        Queue<Integer> heap = new PriorityQueue<>((n1, n2) -> count.get(n1) - count.get(n2));
        for (int n: count.keySet()) {
          heap.add(n);
          if (heap.size() > k) 
        	  heap.poll();
          System.out.println(heap);
        }
        int[] top = new int[k];
        for(int i = k - 1; i >= 0; --i) 
            top[i] = heap.poll();
        return top;
    }

	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3};
		topKFrequent(nums, 2);
	}
}
