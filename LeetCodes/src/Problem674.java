public class Problem674 {

	public static int findLengthOfLCIS(int[] nums) {
		int cnt = 1, maxCnt = 1;
		if(nums.length == 0)
			return 0;
        for(int i=0;i<nums.length-1;i++) {
        	if(nums[i] < nums[i+1]) {
        		cnt++;
        		maxCnt = Math.max(cnt, maxCnt);
        	}
        	else
        		cnt = 1;
        }
        System.out.println(maxCnt);
		return maxCnt;
    }
	
	public static void main(String[] args) {
		int[] nums = {1,3,5,4,7};
		findLengthOfLCIS(nums);
	}
}
