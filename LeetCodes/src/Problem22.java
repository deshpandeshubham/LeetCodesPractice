import java.util.*;

public class Problem22 {

	public List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<>();
		backtrack(result, n, 0, 0, "");
		return result;
    }
	
	private void backtrack(List<String> result, int max, int open, int close, String str) {
		if(str.length() == 2*max) {
			result.add(str);
			return;
		}
		if(open < max)
			backtrack(result, max, open+1, close, str+"(");
		if(close < open)
			backtrack(result, max, open, close+1, str+")");
	}
	
	public static void main(String[] args) {
		new Problem22().generateParenthesis(3);
	}
}
