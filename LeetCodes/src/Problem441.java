
public class Problem441 {
	
	public static int arrangeCoins(int n) {
        int rows = n, i=1;
        while(n >= i) {
        	if(rows == 0)
        		break;
        	i++;
        	rows--;
        }
        return i;
    }

	public static void main(String[] args) {
		System.out.println(arrangeCoins(8));
	}
}
