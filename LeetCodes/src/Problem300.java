
public class Problem300 {

	public static int lengthOfLIS(int[] nums) {
        int[] counter = new int[nums.length];
        for(int i=0;i<counter.length;i++)
        	counter[i] = 1;
        for(int i=0;i<nums.length-1;i++) {
        	for(int j=i+1;j<nums.length;j++) {
        		if(nums[i] <= nums[j]) {
        			counter[j] = Math.max(counter[j], counter[i] + 1);
        		}
        	}
        }
        int max = counter[0];
        for(int num : counter)
        	max = Math.max(num, max);
        System.out.println(max);
		return max;
    }
	
	public static void main(String[] args) {
		int[] arr = {10,9,2,5,3,7,101,18};
		lengthOfLIS(arr);
	}
}
