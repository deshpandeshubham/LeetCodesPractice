public class Problem136 {

	public static int singleNumber(int[] nums) {
		int result = 0;
		for(int n : nums) {
			result ^= n;
			System.out.println("result : " + result);
		}
		System.out.println(result);
		return result;
	}
	
	public static void main(String[] args) {
		int[] nums = {2,1,1};
		singleNumber(nums);
	}
}
