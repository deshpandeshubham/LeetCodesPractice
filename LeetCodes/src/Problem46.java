import java.util.*;

public class Problem46{

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		helper(nums, result, new ArrayList<>());
		System.out.println(result);
		return result;
    }
	
	private void helper(int[] nums, List<List<Integer>> result, List<Integer> temp) {
		System.out.println(temp);
		if(temp.size() == nums.length) {
			result.add(new ArrayList<>(temp));
			return;
		}
		for(int i=0;i<nums.length;i++) {
			if(temp.contains(nums[i]))
				continue;
			temp.add(nums[i]);
			helper(nums, result, temp);
			temp.remove(temp.size()-1);
		}
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		new Problem46().permute(nums);
	}
}
