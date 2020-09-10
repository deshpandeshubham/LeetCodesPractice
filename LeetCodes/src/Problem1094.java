import java.util.*;

public class Problem1094 {

	public boolean carPooling(int[][] trips, int capacity) {
		if(trips.length == 1 && trips[0][0] > capacity)
			return false;
		int[] arr = new int[1001];
		Arrays.sort(trips, (a,b) -> a[1] - b[1]);
        for(int[] trip : trips) {
        	int pass = trip[0];
        	int start = trip[1];
        	int end = trip[2];
        	arr[start] += pass;
        	arr[end] -= pass;
        }
        for(int i=0;i<1001;i++) {
        	capacity -= arr[i];
        	if(capacity < 0)
        		return false;
        }
		return true;
    }
	
	public static void main(String[] args) {
		int[][] trips = {{3,2,7}, {3,7,9}, {8,3,9}};
		new Problem1094().carPooling(trips, 11);
	}
}
