
public class Problem643 {

	public static double findMaxAverage(int[] nums, int k) {
        double sum = 0, res = 0;
        if(nums.length == 1)
        	return (double) nums[0];
        for(int i=0;i<k;i++)
        	sum += nums[i];
        for(int i=k;i<nums.length;i++) {
        	sum += nums[i] - nums[i-k];
        	res = Math.max(res, sum);
        }
        return res / k;
    }
	
	public static void main(String[] args) {
		int[] arr = {5};
		System.out.println(findMaxAverage(arr, 1));
	}
}
