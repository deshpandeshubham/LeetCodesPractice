public class Problem79 {

	public static boolean exist(char[][] board, String word) {
		char[] wordArr = word.toCharArray();
		for(int i=0;i<board.length;i++) 
			for(int j=0;j<board[0].length;j++) 
				if(traverse(i, j, 0, board, wordArr))
					return true;
        return false;
    }
	
	private static boolean traverse(int row, int col, int index, char[][] board, char[] wordArr) {
		if(row < 0 || col > board[0].length || row > board.length || col < 0) {
			System.out.println("Herre");
			return false;
		}
		if(index == wordArr.length)
			return true;
		if(board[row][col] != wordArr[index])
			return false;
		board[row][col] = '*';
		if(traverse(row+1, col, index+1, board, wordArr) || traverse(row, col+1, index+1, board, wordArr) || traverse(row-1, col, index+1, board, wordArr) || traverse(row, col-1, index+1, board, wordArr))
			return true;
		else {
			board[row][col] = wordArr[index];
			return false;
		}
	}
	
	public static void main(String[] args) {
		char[][] board = {{'a'}};
		System.out.println(exist(board, "a"));
	}
}
