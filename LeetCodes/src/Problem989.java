import java.util.*;

public class Problem989 {

	public static List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> result = new ArrayList<>();
        int i = A.length-1;
        while(i>=0) {
        	K += A[i];
        	result.add(K%10);
        	K /= 10;
        	i--;
        }
		System.out.println(result);
        return result;
    }
	
	public static void main(String[] args) {
		int[] A = {2,7,4};
		addToArrayForm(A, 181);
	}
}
