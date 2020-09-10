import java.util.*;

public class Problem739 {
	
	public int[] dailyTemperatures(int[] T) {
		//Brute Force
		/*int[] result = new int[T.length];
		result[T.length-1] = 0;
		for(int i=0;i<T.length-1;i++) {
			int cnt = 1;
			for(int j=i+1;j<T.length;j++) {
				if(T[j] > T[i]) {
					result[i] = cnt;
					break;
				}
				else
					cnt++;
			}
		}
		return result;*/
		int[] result = new int[T.length];
		Stack<Integer> stack = new Stack();
		for(int i=T.length-1;i>=0;i--) {
			while(!stack.isEmpty() && T[stack.peek()] <= T[i])
				stack.pop();
			result[i] = stack.isEmpty() ? 0 : stack.peek() - i;
			stack.push(i);
		}
		return result;
    }

	public static void main(String[] args) {
		int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
		new Problem739().dailyTemperatures(T);
	}
}
