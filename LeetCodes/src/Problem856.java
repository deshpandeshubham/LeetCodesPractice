import java.util.*;

public class Problem856 {
	
	public static int scoreOfParentheses(String S) {
        int score = 0;
        Stack<Integer> stack = new Stack();
        for(char ch : S.toCharArray()) {
        	if(ch == '(') {
        		stack.push(score);
        		score = 0;
        	}
        	else 
        		score = stack.pop() + Math.max(score*2, 1);
        }
		return score;
    }

	public static void main(String[] args) {
		scoreOfParentheses("(()(()))");
	}
}
