import java.util.*;

public class Problem1021 {

	public static String removeOuterParentheses(String S) {
		char[] inputStr = S.toCharArray();
        char[] outputStr = new char[S.length()];
        int outLen = 0;
        int stackCount= 0;
        for (char inputCh : inputStr) {

            if (stackCount != 0) {
                outputStr[outLen++] = inputCh;
            }

            if (inputCh == '(') {
                 stackCount++;
            } else {
                stackCount--;
            }
            if(stackCount==0) {
                outLen-=1;
            }
        }
        return new String(outputStr);
    }
	
	public static void main(String[] args) {
		removeOuterParentheses("(()())(())");
	}
}
