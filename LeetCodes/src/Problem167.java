public class Problem167 {

	public static int[] twoSum(int[] numbers, int target) {
        int i=0,j=1;
        int[] arr = new int[2];
        while(j<numbers.length) {
        	if(numbers[i] + numbers[j] == target && i < j) {
        		System.out.println("if");
        		arr[0] = i+1;
        		arr[1] = j+1;
        	}
        	if(j==numbers.length-1) {
        		i++;
        		j = i+1;
        	}
        	else
        		j++;
        }
        return arr;
    }
	
	public static void main(String[] args) {
		int[] nums = {5,25,75};	
		twoSum(nums, 100);
	}
}
