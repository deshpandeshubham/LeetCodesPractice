import java.util.*;

public class Problem442 {

	public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> rec = new ArrayList();
        for(int i=0; i<nums.length; i++) {
            int location = Math.abs(nums[i])-1;
            System.out.println("Location : " + location + " Index : " + i);
            if (nums[location]<0) {
            	System.out.println("Fount at : " + location);
                rec.add(location+1);
            } 
            else {
            	nums[location] = -nums[location];
            	for(int n : nums)
                	System.out.print(n + " ");
            	System.out.println();
            }
        }
        return rec;
    }
	
	public static void main(String[] args) {
		int[] arr = {4,3,2,7,8,2,3,1};
		findDuplicates(arr);
	}
}
