import java.util.*;

public class Problem496 {

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		Deque<Integer> stack = new LinkedList<>();
		Map<Integer, Integer> map = new HashMap<>();
		int[] output = new int[nums1.length];
		for (int i = 0; i < nums2.length; i++) {
			while (!stack.isEmpty() && stack.peek() < nums2[i]) {
				map.put(stack.pop(), nums2[i]);
			}
			stack.push(nums2[i]);
		}
		for (int i = 0; i < nums1.length; i++) {
			output[i] = map.getOrDefault(nums1[i], -1);
		}
		return output;
    }
	
	public static void main(String[] args) {
		int[] nums1 = {2,4};
		int[] nums2 = {1,2,3,4};
		nextGreaterElement(nums1, nums2);
	}
}
