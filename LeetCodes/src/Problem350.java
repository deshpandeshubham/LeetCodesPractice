import java.util.ArrayList;
import java.util.Arrays;

public class Problem350 {

	public static int[] intersect(int[] nums1, int[] nums2) {
	        ArrayList<Integer> list = new ArrayList<>();
	        Arrays.sort(nums1);
	        Arrays.sort(nums2);
	        int i=0,j=0;
	        while(i < nums1.length && j < nums2.length) {
	        	if(nums1[i] == nums2[j]) {
	        		list.add(nums1[i]);
	        		i++;
	        		j++;
	        	}
	        	else if(nums1[i] < nums2[j])
	        		i++;
	        	else if(nums1[i] > nums2[j])
	        		j++;	
	        }
	        int[] arr = new int[list.size()];
	        for(int k=0;k<arr.length;k++)
	        	arr[k] = list.get(k);
	        return arr;
    }
	
	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1}, nums2 = {2};
		int[] arr = intersect(nums1, nums2);
		for(int n : arr)
			System.out.print(n + " ");
	}
}
