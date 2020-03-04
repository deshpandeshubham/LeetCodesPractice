public class Problem326 {

	public static boolean isPowerOfThree(int n) {
        if(n == 1 || n == 2)
        	return false;
        if(n == 0)
        	return true;
		int product = 3;
        while(product <= n) {
        	if(product == n)
        		return true;
        	product *= 3;
        }
		return false;
    }
	
	public static void main(String[] args) {
		System.out.println(isPowerOfThree(3));
	}
}
