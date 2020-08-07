import java.util.*;

public class Problem1437 {
	
	public static boolean kLengthApart(int[] nums, int k) {
		//Brute Force - Time Limit Exceeded
		/*for(int i=0;i<nums.length-k;i++) {
			int cnt = 0;
			for(int j=i;j<=i+k;j++) {
				if(nums[j] == 1) {
					cnt++;
					if(cnt > 1)
						return false;
				}
			}
		}
        return true;*/
		int index = -1;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == 1) {
				if(i < index+k)
					return false;
				index = i;
			}
		}
		return true;
    }

	public static void main(String[] args) {
		int[] nums = {1,0,0,1,0,1};
		System.out.println(kLengthApart(nums, 2));
	}
}
