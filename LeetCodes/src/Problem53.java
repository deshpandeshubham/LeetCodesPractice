public class Problem53 {

	public static int maxSubArray(int[] nums) {
		int max = nums[0];
		int sum = nums[0];
		for(int i=1;i<nums.length;i++) {
			sum += nums[i];
			sum = Math.max(nums[i], sum);
			max = Math.max(sum, max);
		}
		System.out.println(max);
		return max;
	}
	
	public static void main(String[] args) {
		int[] nums = {-1,4,5,-3};
		maxSubArray(nums);
	}
}
