import java.util.*;

public class Problem448 {

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> res = new ArrayList();
        for (int i=0; i<nums.length; i++){
            if (nums[i] == i+1)
                continue;
            else {
                int swap = nums[i];
                while (nums[i] != i+1){
                	System.out.println("In while : " + nums[i] + " != " + (i+1));
                    if (nums[i] != nums[swap-1]){
                    	System.out.println("In if : " + nums[i]);
                        int tmp = nums[swap-1];
                        nums[swap-1] = swap;
                        nums[i] = tmp;
                        swap = tmp;
                    } 
                    else{
                        break;
                    }
                }
            }
        }
        for(int n : nums)
        	System.out.print(n + " ");
        for (int i=0; i<nums.length;i++){
            if (nums[i] != i+1)
                res.add(i+1);
        }
        System.out.println(res);
        return res;
    }
	
	public static void main(String[] args) {
		int[] nums = {2,1,2};
		findDisappearedNumbers(nums);
	}
}
