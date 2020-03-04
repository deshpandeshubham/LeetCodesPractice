import java.util.*;

public class Problem1342 {

	public static int minSetSize(int[] arr) {
		int[] count = new int[100001];
        for(int a : arr) 
            count[a]++;
        Arrays.sort(count);
        int n = arr.length;
        int i=0,sum = 0;
        for(i = count.length - 1; i>=0; i--) {
            sum += count[i];
            if(sum >= n/2)
                break;
        }
        return count.length - i;
    }

	public static void main(String[] args) {
		int[] arr = {3,3,3,3,5,5,5,2,2,7};
		minSetSize(arr);
	}
}
