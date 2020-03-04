import java.util.*;

public class Problem1313 {

	public static int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
		for(int i=1;i<nums.length;i+=2)
        	for(int j=0;j<nums[i-1];j++)
        		list.add(nums[i]);
		int[] arr = new int[list.size()];
		for(int i=0;i<arr.length;i++)
			arr[i] = list.get(i);
        return arr;
    }
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		decompressRLElist(nums);
	}
}
