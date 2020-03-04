public class Problem204 {

	public static int countPrimes(int n) {
        int cnt = 2, primeCnt = 0;
        while(cnt < n) {
            int pcnt = 0;
            for(int i=1;i<=cnt;i++) {
                if(cnt % i == 0)
                    pcnt++;
            }
            if(pcnt == 2) {
            	System.out.println(cnt);
                primeCnt++;
            }
            cnt++;
        }
        return primeCnt;
    }
	
	public static void main(String[] args) {
		countPrimes(10);
	}
}
