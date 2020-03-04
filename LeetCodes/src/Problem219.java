
public class Problem219 {

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0, j = 0;
        while(i < nums.length - 1) {
        	if(nums[i] == nums[j] && i != j)
        		return true;
        	if(j == i + k || j == nums.length - 1) {
        		i++;
        		j = i+1;
        	}
        	else
        		j++;
        }
        return false;
    }
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,1,2,3};
		System.out.println(containsNearbyDuplicate(nums, 2));
	}
}
