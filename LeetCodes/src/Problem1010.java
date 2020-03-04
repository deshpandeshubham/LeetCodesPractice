public class Problem1010 {

	public static int getPairs(int[] time) {
		int ans = 0;
	    int[] count = new int[60];
	
	    for (int t : time) {
	      t %= 60;
	      System.out.println("t : " + t);
	      ans += t == 0 ? count[0] : count[60 - t];
	      count[t]++;
	    }
	    for(int c : count)
	    	System.out.print(c+" ");
	    return ans;
	}
	
	public static void main(String[] args) {
		int[] time = {30,20,150,100,40};
		getPairs(time);
	}
}
