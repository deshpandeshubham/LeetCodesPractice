import java.util.*;
	
public class Problem287 {

	public int findDuplicate(int[] nums) {
		int slowPointer = nums[0];
		int fastPointer = nums[0];
		slowPointer = nums[slowPointer];
		fastPointer = nums[nums[fastPointer]];
		while(slowPointer != fastPointer) {
			slowPointer = nums[slowPointer];
			fastPointer = nums[nums[fastPointer]];
		}
		slowPointer = nums[0];
        while(slowPointer != fastPointer) {
            slowPointer = nums[slowPointer];
            fastPointer = nums[fastPointer];
        }
		return slowPointer;
    }
	
	public static void main(String[] args) {
		int[] nums = {1,3,4,2,2};
		new Problem287().findDuplicate(nums);
	}
}
