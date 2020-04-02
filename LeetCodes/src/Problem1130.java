import java.util.*;

public class Problem1130 {

	public static int mctFromLeafValues(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		int result = 0;
		for(int num : arr) {
			while(!stack.isEmpty() && num >= stack.peek()) {
				int n = stack.pop();
				if(stack.isEmpty())
					result += n * num;
				else
					result += n * Math.min(num, stack.peek());
			}
			stack.push(num);
		}
		while(stack.size() > 1) 
			result += stack.pop() * stack.peek();
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = {6,2,4};
		System.out.println(mctFromLeafValues(arr));
	}
}
