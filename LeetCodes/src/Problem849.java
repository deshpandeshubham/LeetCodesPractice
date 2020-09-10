
public class Problem849 {
	
	public int maxDistToClosest(int[] seats) {
		int prev = -1, next = 0, result=0;
		for(int i=0;i<seats.length;i++) {
			if(seats[i] == 1)
				prev = i;
			else {
				while(next < seats.length && seats[next] == 0 || next < i)
					next++;
				int left = prev == -1 ? seats.length : i-prev;
				int right = next == seats.length ? seats.length : next-i;
				result = Math.max(result, Math.min(left, right));
			}
		}
		return result;
    }

	public static void main(String[] args) {
		int[] arr = {1,0,0,0,1,0,1};
		System.out.println(new Problem849().maxDistToClosest(arr));
	}
}
