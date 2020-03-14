
public class Problem1299 {

	public static int[] replaceElements(int[] arr) {
		int max = -1;
		for(int i=arr.length-1;i>=0;i--) {
			int temp = arr[i];
			arr[i] = max;
			if(temp > max)
				max = temp;
		}
		return arr;
    }
	
	public static void main(String[] args) {
		int[] arr = {17,18,5,4,6,1};
		replaceElements(arr);
	}
}
