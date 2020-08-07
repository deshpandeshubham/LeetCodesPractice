import java.util.*;

public class Problem241 {

	public static List<Integer> diffWaysToCompute(String input) {
		List<Integer> result = new ArrayList<>();
		System.out.println("Input : " + input);
        for(int i=0;i<input.length();i++) {
        	System.out.println("i : " + i);
            if(input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*') {
                String left = input.substring(0, i);
                String right = input.substring(i+1);
                List<Integer> leftNums = diffWaysToCompute(left);
                List<Integer> rightNums = diffWaysToCompute(right);
                System.out.println("Left : " + leftNums);
                System.out.println("Left : " + rightNums);
                for(int l : leftNums) {
                    for(int r : rightNums) {
                        int temp = 0;
                        switch(input.charAt(i)) {
                            case '+' :  temp = l + r;
                                        break;
                            case '-' :  temp = l - r;
                                        break;
                            case '*' :  temp = l * r;
                                        break;
                        }
                        result.add(temp);
                    }
                }
            }
        }
        if(result.size() == 0)
            result.add(Integer.valueOf(input));
        System.out.println("REsult : " + result);
        return result;
	}
	
	public static void main(String[] args) {
		diffWaysToCompute("2-1-1");
	}
}
