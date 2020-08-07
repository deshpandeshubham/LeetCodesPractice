
public class Problem598 {
	
	public static int maxCount(int m, int n, int[][] ops) {
		int max = 0;
		int[][] mat = new int[m][n];
		for(int[] arr : ops) {
			int r = arr[0];
			int c = arr[1];
			for(int i=0;i<r;i++) 
				for(int j=0;j<c;j++) 
					mat[i][j]++;
		}
		for(int i=0;i<m;i++) 
			for(int j=0;j<n;j++) 
				max = Math.max(max, mat[i][j]);
		int cnt = 0;
		for(int i=0;i<m;i++) 
			for(int j=0;j<n;j++) 
				if(mat[i][j] == max)
					cnt++;
		return cnt;
    }

	public static void main(String[] args) {
		int[][] ops = {{2,2},{3,3}};
		System.out.println(maxCount(3, 3, ops));
	}
}
