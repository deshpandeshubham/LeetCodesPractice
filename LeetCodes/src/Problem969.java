import java.util.*;

public class Problem969 {

	public static List<Integer> pancakeSort(int[] A) {
		List<Integer> result = new ArrayList<>();
		int n = A.length - 1;
		while(!(sorted(A))) {
			int largestIndex = getLargestIndex(A, n);
			A = flip(A, largestIndex);
			result.add(largestIndex+1);
			A = flip(A, n);
			result.add(n+1);
			n--;
		}
		return result;
	}
	
	public static boolean sorted(int[] arr) {
		for(int i=0;i<arr.length-1;i++)
			if(arr[i] > arr[i+1])
				return false;
		return true;
	}
	
	public static int getLargestIndex(int[] arr, int end) {
		int index = 0;
		for(int i=1;i<=end;i++) 
			if(arr[index] < arr[i])
				index = i;
		return index;
	}
	
	public static int[] flip(int[] arr, int end) {
		int i=0, j=end;
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] A = {3,2,4,1};
		System.out.println(pancakeSort(A));
	}
}
