public class Problem1329 {

	public static int[][] diagonalSort(int[][] mat) {
        for(int i=0;i<mat.length-1;i++) {
        	for(int j=0;j<mat[0].length-1;j++) {
        		if(mat[i][j] > mat[i+1][j+1]) {
        			System.out.println("Element : " + mat[i][j] + " at " + i + j);
        			int temp = mat[i][j];
        			mat[i][j] = mat[i+1][j+1];
        			mat[i+1][j+1] = temp;
        		}
        	}
        }
        for(int i=0;i<mat.length;i++) {
        	for(int j=0;j<mat[0].length;j++) {
        		System.out.print(mat[i][j] + " ");
        	}
        	System.out.println();
        }
		return mat;
    }
	
	public static void main(String[] args) {
		int[][] mat = {{3,3,1,1},{2,2,1,2},{1,1,1,2}};
		diagonalSort(mat);
	}
}
