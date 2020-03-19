import java.util.*;

public class Problem1047 {

	public static String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
        for(int i=0;i<S.length();i++) {
			char ch = S.charAt(i);
			if(stack.isEmpty())
				stack.push(ch);
			else {
				if(stack.peek() == ch)
					stack.pop();
				else {
					stack.push(ch);
				}
			}
		}
        while(!stack.isEmpty())
        	sb.append(stack.pop());
        System.out.println(sb.reverse().toString());
        return sb.reverse().toString();
    }
	
	public static void main(String[] args) {
		removeDuplicates("abbaca");
	}
}
