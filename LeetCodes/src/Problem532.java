import java.util.*;

public class Problem532 {

	public static int findPairs(int[] nums, int k) {
        HashSet<String> uniquePairs = new HashSet();
        int i=0,j=1;
        while(i<nums.length-1 && j<nums.length) {
        	if(Math.abs(nums[i] - nums[j]) == k) 
        		if(!uniquePairs.contains(Integer.toString(nums[j])+Integer.toString(nums[i])))
        			uniquePairs.add(Integer.toString(nums[i])+Integer.toString(nums[j]));
        	if(j == nums.length-1) {
        		i++;
        		j = i+1;
        	}
        	else
        		j++;
    	}
        System.out.println(uniquePairs);
        return uniquePairs.size();
    }
	
	public static void main(String[] args) {
		int[] nums = {1,1,1,2,1};
		findPairs(nums, 1);
	}
}
