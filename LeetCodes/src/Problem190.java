
public class Problem190 {

	public static int reverseBits(int n) {
		int ans = 0;
        for(int i=0; i < 31; i++) {
            ans += (n & 1);    // add the new bit
            ans = ans << 1;   // left shift ans to mantain previous bits
            n = n >> 1;         // get the right most bit
        }
        ans += (n & 1);
        return ans;
    }
	
	public static void main(String[] args) {
		reverseBits(43261596);
	}
}
