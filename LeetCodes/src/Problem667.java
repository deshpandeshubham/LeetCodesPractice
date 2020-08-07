public class Problem667 {
	
	public static int[] constructArray(int n, int k) {
		int[] result = new int[n];
	    int index = 0;
	    int x = 1, y = k+1;
	    while (x <= y) {
	        result[index++] = x++;
	        if (x < y) 
	            result[index++] = y--;
	    }
	    for (int i=index+1; i<=n; i++) 
	        result[index++] = i;
	    return result;
	}

	public static void main(String[] args) {
		constructArray(3, 2);
	}
}
