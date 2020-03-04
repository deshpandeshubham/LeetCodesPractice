import java.util.*;

public class Problem189 {

	public static void rotate(int[] nums, int k) {
		int l = 0, r = nums.length - 1;
		while(l < r) {
			int temp = nums[l];
			nums[l] = nums[r];
			nums[r] = temp;
			l++;
			r--;
		}
		reverse(nums, 0, k-1);
		reverse(nums, k, nums.length-1);
		for(int n : nums)
			System.out.print(n + " ");
	}
	
	public static void reverse(int[] nums, int start, int end) {
		while(start <= end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		rotate(arr, 3);
	}
}
