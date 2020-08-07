
public class Problem238 {
	
	public static int[] productExceptSelf(int[] nums) {
		/* Brute Force Approach
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
			int product = 1;
			for(int j=0;j<nums.length;j++) 
				if(i != j)
					product *= nums[j];  
			result[i] = product; 
		}
		return result;*/
		
		//O(n) Time :
		
		int[] result = new int[nums.length];
		result[0] = 1;
		for(int i=1;i<nums.length;i++) 
			result[i] *= nums[i-1] * result[i-1]; 
		int right = 1;
		for(int i=nums.length-1;i>=0;i--) {
			result[i] = result[i] * right;
			right *= nums[i];
		}
		return result;
    }

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		productExceptSelf(arr);
	}
}
