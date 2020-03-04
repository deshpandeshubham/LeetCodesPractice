import java.util.*;

public class Problem198 {

	public static int rob(int[] nums) {
        int max = 0, sum1 = 0, sum2 = 0;
        List<Integer> list = new ArrayList<>();
        int i=0,j=1;
        while(i<nums.length && j<nums.length-1) {
        	sum1 += nums[i];
        	sum2 += nums[j];
        	i += 2;
        	j += 2;
        }
        return Math.max(sum1, sum2);
    }
	
	public static void main(String[] args) {
		int[] nums = {2,7,9,3,1};
		System.out.println(rob(nums));
	}
}
