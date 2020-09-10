import java.util.*;

public class Problem378 {
	
	public int kthSmallest(int[][] matrix, int k) {
		/* Simple Logic : Extra temp array
			int[] temp = new int[matrix.length*matrix[0].length];
	        int index = 0;
	        for(int i=0;i<matrix.length;i++) {
	            for(int j=0;j<matrix[0].length;j++) {
	                temp[index++] = matrix[i][j];
	            }
	        }
	        Arrays.sort(temp);
	        return temp[k-1];
        */
		
		/* Using Max Heap
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((n1, n2) -> n2 - n1);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                maxHeap.add(matrix[i][j]);
                if (maxHeap.size() > k) {
                    maxHeap.poll();
                }
            }
        }
        return maxHeap.peek();*/
		return 0;
    }

	public static void main(String[] args) {
		int[][] matrix = {{1,  5,  9},
						  {10, 11, 13},
						  {12, 13, 15}};
		System.out.println(new Problem378().kthSmallest(matrix, 8));
	}
}
