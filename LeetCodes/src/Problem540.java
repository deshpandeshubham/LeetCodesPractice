
public class Problem540 {
	
	public static int singleNonDuplicate(int[] nums) {
        //Naive
		/*for(int i=1;i<nums.length;i++) {
        	if(nums[i] == nums[i-1]) {
        		nums[i] = -1;
        		nums[i-1] = -1;
        	}
        }
        for(int n : nums)
        	if(n != -1)
        		return n;*/
		int res = 0;
		for(int x : nums){
			res ^= x;
			System.out.println(x + " " + res);
	    }
		return 0;
    }

	public static void main(String[] args) {
		int[] nums = {1,1,2};
		System.out.println(singleNonDuplicate(nums));
	}
}
