import java.util.*;

public class Problem581 {

	public static int findUnsortedSubarray(int[] nums) {
		/*int[] newArr = nums.clone();
		Arrays.sort(newArr);
		int start = nums.length, end = 0;
		for(int i=0;i<nums.length;i++) {
			if(newArr[i] != nums[i]) {
				start = Math.min(start, i);
				end = Math.max(end, i);
			}
		}
		return end-start+1;*/
		int left = nums.length, right = 0;
		int flag = 1;
		for(int i=1;i<nums.length;i++) {
			if(nums[i] < nums[i-1])
				flag = 0;
			if(flag == 0)
				left = Math.min(left, nums[i]);
		}
		flag = 1;
		for(int i=nums.length-2;i>=0;i--) {
			if(nums[i] < nums[i+1])
				flag = 0;
			if(flag == 0)
				right = Math.max(right, nums[i]);
		}
		int start, end;
		for(start = 0;start < nums.length; start++)
			if(left < nums[start])
				break;
		for(end=nums.length-1;end>=0;end--)
			if(right > nums[end])
				break;
		return end-start+1;
    }
	
	public static void main(String[] args) {
		int[] arr = {2, 6, 4, 8, 10, 9, 15};
		System.out.println(findUnsortedSubarray(arr));
	}
}
