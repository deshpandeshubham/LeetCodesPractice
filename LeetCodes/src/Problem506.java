import java.util.*;

public class Problem506 {

	public static String[] findRanks(int[] nums) {
		String[] result = new String[nums.length];
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++)
			map.put(nums[i], i);
		Arrays.sort(nums);
		int index = 0;
		for(int i=nums.length-1;i>=0;i--) {
			int numIndex = map.get(nums[i]);
			if(i == nums.length - 1)
				result[numIndex] = "Gold Medal";
			else if(i == nums.length - 2)
				result[numIndex] = "Silver Medal";
			else if(i == nums.length - 3)
				result[numIndex] = "Bronze Medal";
			else
				result[numIndex] = String.valueOf(index+1);
			index++;
		}
		for(String s : result)
			System.out.print(s + " ");
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1};
		String temp = null;
		for(int i=0;i<2;i++) {
			temp = "";
			temp = "shubham";
			temp += "Deshpande";
		}
		System.out.println(temp);
		findRanks(arr);
	}
}
