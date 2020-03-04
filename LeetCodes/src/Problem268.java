import java.util.Arrays;

public class Problem268 {

	public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i+1] - nums[i] != 1)
            	return nums[i]+1;
        }
        return nums[0];
    }
	
	public static void main(String[] args) {
		int[] arr = {0,2};
		System.out.println(missingNumber(arr));
	}
}
