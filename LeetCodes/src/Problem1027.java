import java.util.*;

public class Problem1027 {
	
	public static int longestArithSeqLength(int[] A) {
		int maxLength = 1;
		HashMap<Integer, Integer> map[] = new HashMap[A.length];
		map[0] = new HashMap();
		for(int i=1;i<A.length;i++) {
			map[i] = new HashMap<>();
			for(int j=0;j<i;j++) {
				System.out.println(A[i] + " : " + A[j]);
				int diff = A[i] - A[j];
				int len = map[j].getOrDefault(diff, 1) + 1;
				System.out.println("Len : " + len);
				map[i].put(diff, len);
				System.out.println(map[i]);
				maxLength = Math.max(len, maxLength);
			}
		}
		return maxLength;
    }

	public static void main(String[] args) {
		int[] arr = {3,6,9,12};
		System.out.println(longestArithSeqLength(arr));
	}
}
