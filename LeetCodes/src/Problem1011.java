
public class Problem1011 {

	public int shipWithinDays(int[] weights, int D) {
        int min=0, max=0, capacity = 0;
        for(int w : weights) {
        	min = Math.max(min, w);
        	max += w;
        }
        while(min <= max) {
        	int mid = (min + max) / 2;
        	int days = noOfDays(weights, mid);
        	if(days > D)
        		min = mid + 1;
        	else {
        		capacity = mid;
        		max = mid - 1;
        	}
        }
        System.out.println(capacity);
        return capacity;
    }
	
	private int noOfDays(int[] weights, int cap) {
		int days = 1, curr = 0;
		for(int w : weights) {
			curr += w;
			if(curr > cap) {
				days++;
				curr = w;
			}
 		}
		return days;
	}
	
	public static void main(String[] args) {
		int[] weights = {1,2,3,4,5,6,7,8,9,10};
		new Problem1011().shipWithinDays(weights, 5);
	}
}
