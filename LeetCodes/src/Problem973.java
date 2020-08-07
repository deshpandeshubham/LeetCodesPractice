import java.util.Arrays;

public class Problem973 {
	
	public static int[][] kClosest(int[][] points, int K) {
        int[][] result = new int[K][2];
        int[] distance = new int[points.length];
        int i=0;
        for(int[] point : points) 
        	distance[i++] = getDistance(point);
        Arrays.sort(distance);
        int distK = distance[K-1];
        int k = 0;
        for(int point[] : points)
        	if(getDistance(point) <= distK)
        		result[k++] = point;
        return result;
    }
	
	private static int getDistance(int[] point) {
		return point[0] * point[0] + point[1] * point[1];
	}

	public static void main(String[] args) {
		int[][] points = {{3,3},{5,-1},{-2,4}};
		kClosest(points, 2);
	}
}
