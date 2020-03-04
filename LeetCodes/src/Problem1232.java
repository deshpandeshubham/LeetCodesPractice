public class Problem1232 {

	public static boolean checkStraightLine(int[][] coordinates) {
        float slope = (coordinates[1][1] - coordinates[0][1]) / (coordinates[1][0] - coordinates[0][0]);
        float temp = 0;
        for(int i=2;i<coordinates.length;i++) {
            temp = (float)(coordinates[i][1] - coordinates[0][1]) / (coordinates[i][0] - coordinates[0][0]);
        	if(temp != slope)
        		return false;
        }
        return true;
    }
	
	public static void main(String[] args) {
		int[][] points = {{-3,-2},{-1,-2},{2,-2},{-2,-2},{0,-2}};
		System.out.println(checkStraightLine(points));
	}
}
