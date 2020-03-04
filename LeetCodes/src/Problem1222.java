import java.util.*;

public class Problem1222 {

	public static List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> attackPoss = new ArrayList<>();
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1},{1,1},{-1,-1},{1,-1},{-1,1}};
        boolean[][] isQueen = new boolean[8][8];
        for(int[] q : queens)
        	isQueen[q[0]][q[1]] = true;
        for(int[] dir : directions) {
        	int row = king[0] + dir[0];
        	int col = king[1] + dir[1];
        	while(row >= 0 && row < 8 && col >= 0 && col < 8) {
	        	if(isQueen[row][col]) {
	        		attackPoss.add(Arrays.asList(row, col));
	        		break;
	        	}
	        	row += dir[0];
	        	col += dir[1];
        	}
        }
        return attackPoss;
    }
	
	public static void main(String[] args) {
		int[][] queens = {{0,1},{1,0},{4,0},{0,4},{3,3},{2,4}};
		int[] king = {0,0};
		queensAttacktheKing(queens, king);
	}
}
