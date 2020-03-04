public class Problem172 {

	public static int trailingZeroes(int n) {
        int fact = getFactorial(n);
        int cnt = 0;
        System.out.println("Factorial : " + fact);
        while(fact > 0) {
        	int digit = fact % 10;
        	System.out.println("Digit : " + digit);
        	if(digit == 0)
        		cnt++;
        	else
        		break;
        	fact /= 10;
        }
        System.out.println("Zeroes : " + cnt);
		return 0;
    }
	
	public static int getFactorial(int num) {
		if(num == 0 || num == 1)
			return 1;
		return num * getFactorial(num - 1);
	}
	
	public static void main(String[] args) {
		trailingZeroes(13);
	}
}
