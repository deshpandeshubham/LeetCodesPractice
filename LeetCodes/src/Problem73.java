import java.util.*;

public class Problem73 {
	
	public static void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        for(int i=0;i<matrix.length;i++) {
        	for(int j=0;j<matrix[0].length;j++) {
        		if(matrix[i][j] == 0) {
        			rows.add(i);
        			cols.add(j);
        		}
        	}
        }
        for(int r : rows) 
        	for(int i=0;i<matrix[0].length;i++) 
        		matrix[r][i] = 0;
        for(int i=0;i<matrix.length;i++)
        	for(int c : cols)
        		matrix[i][c] = 0;
    }

	public static void main(String[] args) {
		int[][] matrix = {{0,1,2,0},
				  		  {3,4,5,2},
				  		  {1,3,1,5}};
		setZeroes(matrix);
	}
}
