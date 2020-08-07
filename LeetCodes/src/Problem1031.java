public class Problem1031 {

	public static int maxSumTwoNoOverlap(int[] A, int L, int M) {
		//return Math.max (getSum(A, L, M), getSum(A, M, L));
		
		return 0;
	}

	/*private static int getSum(int[] A, int L, int M) {
        int sum1 = 0;
        int end1 = 0;
        for (int i = 0; i < L; i++) {
            sum1 += A[end1++];
        }
        int maxSum1 = sum1;
        
        int sum2 = 0;
        int end2 = L;
        for (int i = 0; i < M; i++) {
            sum2 += A[end2++];
        }
        
        int res = maxSum1 + sum2;
        while (end2 < A.length) {
            sum1 += A[end1] - A[end1 - L];
            sum2 += A[end2] - A[end2 - M];
            maxSum1 = Math.max(maxSum1, sum1);
            res = Math.max(res, maxSum1 + sum2);
            end1++;
            end2++;
        }
        return res;
    }*/
	
	public static void main(String[] args) {
		int[] A = {2,1,5,6,0,9,5,0,3,8};
		System.out.println(maxSumTwoNoOverlap(A, 4, 3));
	}
}
