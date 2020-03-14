
public class Problem1343 {

	public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int cnt = 0;
        for(int i=0;i<=arr.length-k;i++) {
        	int sum = 0;
        	for(int j=i;j<i+k;j++) 
        		sum += arr[j];
        	if(sum / k >= threshold)
        		cnt++;
        }
        System.out.println(cnt);
		return cnt;
    }
	
	public static void main(String[] args) {
		int[] arr = {1,1,1,1,1};
		numOfSubarrays(arr, 1, 0);
	}
}
